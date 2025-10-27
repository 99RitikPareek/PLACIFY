package spr.beans;

public class Tpo 
{
    private int id;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tpo() {
    }

    public Tpo(int id, String password) {
        this.id = id;
        this.password = password;
    }
    
    
    
}