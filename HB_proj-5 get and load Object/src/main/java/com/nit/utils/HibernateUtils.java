package com.nit.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
    static {
    	try {
    		Configuration cfg=null;
        	cfg=new Configuration();
        	cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
        	factory=cfg.buildSessionFactory();
    			}
    	catch(HibernateException he) {
    		he.printStackTrace();
    		}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
   }
    public static  Session openSession() {
    	if(factory!=null)
    		return factory.openSession();
    	else
    		return null;
    }
    public static void closeSession(Session ses) {
    	if(ses!=null)
    		ses.close();
     }
    public static void closeFactory() {
    	if(factory!=null)
    		factory.close();
    }
}
