
public class Flash extends javax.swing.JFrame implements Runnable 
{

    
    public Flash() {
        initComponents();
        Thread thread=new Thread(this);
        thread.start();
    }
    
    public void run()
    {
        try 
        {
            for(int i=jProgressBar1.getMinimum();i<=jProgressBar1.getMaximum();i++)
            {
                jProgressBar1.setValue(i);
                Thread.sleep(90);
            }
            new LoginWindow().setVisible(true);
            dispose();
             }
            catch(Exception ex)
                    {
                    ex.printStackTrace();
                    }
        }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1190, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flash.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1266, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1266, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1191, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
