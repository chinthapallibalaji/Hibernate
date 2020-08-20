package com.nit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.HB_Product;
import com.nit.utils.HibernateUtils;
 
public class PersistObject {
	 public static void main(String[] args) {
		Session ses=null;
		HB_Product prod=null;
		Transaction tx=null;
		boolean flag=false;
		
		
		  ses=HibernateUtils.openSession();
		  prod=new HB_Product();
		  prod.setPid(1047);
		  prod.setPname("CHAIR");
		  prod.setPrice(1500.00f);
	      prod.setQty(2);
		  try {
			 tx=ses.beginTransaction();
			  ses.persist(prod);
			
			  flag=true;
			 
		  }
		  catch(HibernateException he) {
			  he.printStackTrace();
			  flag=false;
			  System.out.println("product detials saving failed");
		  }
		  finally {
					  if(flag==true) {
						  tx.commit();
					  System.out.println(" product detials saved successfully");
					  }
					else
						  tx.rollback();
				
			      HibernateUtils.closeSession(ses);
			      HibernateUtils.closeFactory();
			      
		  }
		
	}

}
 