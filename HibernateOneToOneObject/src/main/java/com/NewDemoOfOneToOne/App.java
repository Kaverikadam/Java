package com.NewDemoOfOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Job1 j1=new Job1();
		Fresher1 f1=new Fresher1(555,"Kaveri",j1);
		
		j1.setJobId(505);
		j1.setDesignation("Developer");
		j1.setSalary(500000);
		j1.setFresher(f1);
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		
		
		session.save(j1);
		session.save(f1);
		
		tr.commit();
		
	}

}
