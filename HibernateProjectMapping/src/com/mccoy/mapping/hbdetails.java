package com.mccoy.mapping;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hbdetails {
	
	public  void saveUser(String name, String email, long mobileno,String account,String bankname) {
	
		        Session session = HibernateUtil.getSessionFactory();
		        Transaction trans = null;
		        try {
		            trans = session.beginTransaction();
		        	
			       List<Bank> l1 = new ArrayList<Bank>();
		        	User u = new User();
		        	
		        	
		        	
		        	u.setName(name);
                    u.setEmail(email);
                    u.setMobileno(mobileno);

                    Bank b = new Bank();

            		
            			String sql="from User";
            			SessionFactory sf = new Configuration().configure().buildSessionFactory();
            			Session session1 = sf.openSession();
            			Query q=session.createQuery(sql);
            			Iterator it = q.iterate();
            			
            			while(it.hasNext())
            			{
            				User ui = (User) it.next();
            				if((ui.getMobileno()==mobileno || ui.getEmail()==email))
            				{
            					System.out.println("repeated");
            				}
            				
            				
            				
            			}
                    
                    b.setAccount(account);
		        	b.setBankname(bankname);
                    b.setUser(u);
                    l1.add(b);
                    u.setBank(l1);
                    session.save(b);
		        	session.save(u);
		         	trans.commit();
		         	  session.close();
		        
		        } catch (HibernateException e) {
		           trans.rollback();
		            e.printStackTrace();
		        }
		    }
}

	
	