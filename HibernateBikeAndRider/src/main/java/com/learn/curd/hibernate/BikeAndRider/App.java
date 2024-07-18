package com.learn.curd.hibernate.BikeAndRider;



import java.util.ArrayList;
import java.util.List;


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
        
        Rider r1=new Rider();
        Bike b1=new Bike(3214,"Tvs",120000,r1);
        Bike b2=new Bike(4562,"Yamaha",621000,r1);
    	
        List<Bike> bl1=new ArrayList<Bike>();
        bl1.add(b1);
        bl1.add(b2);
        
        r1.setRID(2);
        r1.setName("KK");
        r1.setBikes(bl1);
        
    	session.save(r1);
    	session.save(b1);
    	session.save(b2);
    	tr.commit();
    }
}
