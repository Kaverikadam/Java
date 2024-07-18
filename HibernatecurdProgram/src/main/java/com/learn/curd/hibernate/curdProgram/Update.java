package com.learn.curd.hibernate.curdProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main( String[] args )
    {
        Configuration   cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
       
        //fetch object
        System.out.println("Trainer data");
        
        Trainer t=session.get(Trainer.class, 2);
        
        t.setSalary(200000);
        Transaction tx=session.beginTransaction();
        session.save(t);
        
        tx.commit();
        System.out.println("Object updated");
    }
}
