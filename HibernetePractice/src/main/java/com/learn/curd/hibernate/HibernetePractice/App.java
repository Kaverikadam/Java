package com.learn.curd.hibernate.HibernetePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    	cfg.configure();
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	//Inserting data
//    	StudentData st1=new StudentData(2,"Monika",84);
//    	StudentData st2=new StudentData(3,"Arati",66);
//    	StudentData st3=new StudentData(4,"anuraga",89);
//    	
//    	session.save(st1);
//    	session.save(st2);
//    	session.save(st3);
    	
    	
    	
    	//Fetching data
    	StudentData st=session.get(StudentData.class, 3);
    	System.out.println(st);
    	
    	//Updating 
    	
//    	st.setSt_marks(95);
    	
//    	System.out.println(st);
    	
    	//Delete
    	session.delete(st);
    	
    	tr.commit();
    }
}
