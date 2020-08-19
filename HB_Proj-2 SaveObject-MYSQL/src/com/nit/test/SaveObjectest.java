package com.nit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.HB_Product;
 
public class SaveObjectest {
	 public static void main(String[] args) {
		 Configuration cfg=null;
		 SessionFactory sf=null;
		 Session ses=null;
		HB_Product prod=null;
		Transaction tx=null;
		boolean flag=false;
		
		  cfg = new Configuration();
		  cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
		  sf=cfg.buildSessionFactory();
		  ses=sf.openSession();
		  prod=new HB_Product();
		  //prod.setPid(1043);
		  prod.setPname("CHAIR");
		  prod.setPrice(1500.00f);
	     // prod.setQty(2);
		  try {
			 tx=ses.beginTransaction();
			 int genidval=(int) ( ses.save(prod));
			 System.out.println("pid value="+genidval);
			  flag=true;
			  System.out.println(" product detials saved successfully");
		  }
		  catch(HibernateException he) {
			  he.printStackTrace();
			  flag=false;
			  System.out.println("product detials saving failed");
		  }
		  finally {
					  if(flag==true)
						  tx.commit();
					else
						  tx.rollback();
				
			  ses.close();
			  sf.close();
		  }
		
	}

}
 