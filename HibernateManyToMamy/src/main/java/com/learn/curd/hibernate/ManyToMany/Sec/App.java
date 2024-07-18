package com.learn.curd.hibernate.ManyToMany.Sec;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction  tr=session.beginTransaction();
		
		DevloperSec ds1=new DevloperSec();
		DevloperSec ds2=new DevloperSec();
		DevloperSec ds3=new DevloperSec();
		
		TechSec ts1=new TechSec();
		TechSec ts2=new TechSec();
		TechSec ts3=new TechSec();
		
		List<DevloperSec> d1=new ArrayList<DevloperSec>();
		d1.add(ds1);
		d1.add(ds2);
		List<DevloperSec> d2=new ArrayList<DevloperSec>();
		d2.add(ds1);
		d2.add(ds2);
		d2.add(ds3);
		List<DevloperSec> d3=new ArrayList<DevloperSec>();
		d3.add(ds2);
		d3.add(ds3);
		
		List<TechSec> t1=new ArrayList<TechSec>();
		t1.add(ts1);
		t1.add(ts2);
		List<TechSec> t2=new ArrayList<TechSec>();
		t2.add(ts1);
		t2.add(ts2);
		t2.add(ts3);
		List<TechSec> t3=new ArrayList<TechSec>();
		t2.add(ts2);
		t2.add(ts3);
		
		ds1.setdId(111);
		ds1.setdName("Kaveri");
		ds1.setTech(t1);
		
		ds2.setdId(222);
		ds2.setdName("Kirthi");
		ds2.setTech(t2);
		
		ds3.setdId(3333);
		ds3.setdName("Kavya");
		ds3.setTech(t3);
		
		
		ts1.settId(1234);
		ts1.settName("JAVA");
		ts1.setDev(d1);
		
		ts1.settId(4563);
		ts1.settName("SQL");
		ts1.setDev(d2);
		
		ts1.settId(1234);
		ts1.settName("PYTHON");
		ts1.setDev(d3);
		
		
		session.save(ds1);
		session.save(ds2);
		session.save(ds3);
		session.save(ts1);
		session.save(ts2);
		session.save(ts3);

		tr.commit();
		
	}

}
