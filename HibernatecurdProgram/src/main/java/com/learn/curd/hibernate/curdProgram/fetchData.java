package com.learn.curd.hibernate.curdProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchData {
	 public static void main( String[] args )
	    {
	        Configuration   cfg=new Configuration();
	        cfg.configure();
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session session=factory.openSession();
	       
	        //fetch object
	        System.out.println("Trainer data");
	        
	        Trainer t=session.get(Trainer.class, 1);
	       System.out.println(t);
	       
	    }
}
