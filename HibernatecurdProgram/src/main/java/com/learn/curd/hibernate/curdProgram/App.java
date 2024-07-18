package com.learn.curd.hibernate.curdProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration   cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr =session.beginTransaction();
        Trainer t1=new Trainer(5,"Rakesh",45000);
        session.save(t1);
        tr.commit();
        System.out.println("Object is saved");
        
    }
}
