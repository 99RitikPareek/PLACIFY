package spr.dao;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class LogicalCode
{
    private HibernateTemplate template;
    public HibernateTemplate getTemplate(){
        return template;
    }
    public void setTemplate(HibernateTemplate template){
        this.template=template;
    }
}