package com.learn.curd.hibernate.ManyToMamy;

import java.util.ArrayList;
import java.util.List;

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
        Transaction tr=session.beginTransaction();
        
        Developer dev1=new Developer();        
        Developer dev2=new Developer();
        Developer dev3=new Developer();
        Tech t1=new Tech();
        Tech t2=new Tech();
        Tech t3=new Tech();
        
        List<Developer> l1=new ArrayList<Developer>();
        l1.add(dev1);
        l1.add(dev2);
        List<Developer> l2=new ArrayList<Developer>();
        l2.add(dev1);
        l2.add(dev2);
        l2.add(dev3);
        List<Developer> l3=new ArrayList<Developer>();
        l3.add(dev2);
        l3.add(dev3);
        
        List<Tech> l4=new ArrayList<Tech>();
        l4.add(t1);
        l4.add(t2);
        List<Tech> l5=new ArrayList<Tech>();
        l5.add(t1);
        l5.add(t2);
        l5.add(t3);      
        List<Tech> l6=new ArrayList<Tech>();
        l6.add(t2);
        l6.add(t3);
        
        dev1.setDid(1);
        dev1.setName("Kaveri");
        dev1.setTech(l4);
        
        dev1.setDid(2);
        dev1.setName("Amit");
        dev1.setTech(l5);
        
        dev1.setDid(3);
        dev1.setName("Komal");
        dev1.setTech(l6);
        
        
        t1.setTid(101);
        t1.setTName("Java");
        t1.setDev(l1);
        
        t1.setTid(102);
        t1.setTName("Python");
        t1.setDev(l2);
        
        t1.setTid(101);
        t1.setTName("SQL");
        t1.setDev(l3);
        
        session.save(dev1);
        session.save(dev2);
        session.save(dev3);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        

        tr.commit();

        


        
        
    }
}
