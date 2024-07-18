package com.learn.curd.hibernate.OneToOneObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
//    	Job job1=new Job();
    	
    	
//    	Fresher f1=new Fresher(101,"Kaveri",job1);
//    	
//    	job1.setJob_id(1);
//    	job1.setDesignation("Developer");
//    	job1.setSalary(450000);
//    	job1.setFresher(f1);
    	
    	Job j2=new Job();
    	Fresher f2=new Fresher(102,"Kiran",j2);
    	j2.setJob_id(2);
    	j2.setDesignation("Tester");
    	j2.setSalary(500000);
    	j2.setFresher(f2);
    	
    
    	
    	
        Configuration cfg=new Configuration();
        
        cfg.configure();
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction tr=session.beginTransaction();
        
        //saving 
        session.save(j2);
   
        session.save(f2);
        tr.commit();
       
        
    }
}
