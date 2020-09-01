package com.nit.test;

import org.hibernate.Session;

import com.nit.entity.HB_InsurancePolicies;
import com.nit.utils.HibernateUtils;

public class GetObjectTest {

	public static void main(String[] args) {
		Session ses=null;
		ses=HibernateUtils.openSession();
		HB_InsurancePolicies policy=null;
		policy=ses.get(HB_InsurancePolicies.class, 2000
				);
		if(policy==null) {
		System.out.println("no rows are selected");
		}else {
			System.out.println("records are saved to entity classs");
			System.out.println(policy);
		}
             HibernateUtils.closeSession(ses);
             HibernateUtils.closeFactory();
	}

}
