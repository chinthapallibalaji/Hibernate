package com.nit.entity;

public class HB_InsurancePolicies {
	private Integer policy_num;
	private String policy_name;
	private String policy_type;
	private Integer tenure;
	private String  company;
	public Integer getPolicy_num() {
		return policy_num;
	}
	public void setPolicy_num(Integer policy_num) {
		this.policy_num = policy_num;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "HB_InsurancePolicies [policy_num=" + policy_num + ", policy_name=" + policy_name + ", policy_type="
				+ policy_type + ", tenure=" + tenure + ", company=" + company + "]";
	}
	

}
