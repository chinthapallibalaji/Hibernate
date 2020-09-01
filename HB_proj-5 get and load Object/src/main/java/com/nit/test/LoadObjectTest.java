package com.nit.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nit.entity.HB_InsurancePolicies;
import com.nit.utils.HibernateUtils;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session ses=null;
		ses=HibernateUtils.openSession();
		HB_InsurancePolicies policy=null;
		try {
			
			policy=ses.load(HB_InsurancePolicies.class, 2000);
			System.out.println(policy.getClass());
			}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		
		
             HibernateUtils.closeSession(ses);
             HibernateUtils.closeFactory();
	}

}
