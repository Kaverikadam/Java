package com.learn.HibernatePrograms.hibernateProject;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr =session.beginTransaction();
        Student s1=new Student(11,"Kaveri",86);
        session.save(s1);
        tr.commit();
        System.out.println("Object is saved");
        
       
    }
}
