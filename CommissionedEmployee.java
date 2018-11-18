package com.atossyntel.payrollassignment;

public class CommissionedEmployee extends Employee{
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionedEmployee(int id, String name, String deptId, double grossSales, double commissionRate, int flatNo, String bldName, String area, String city) {
		super(id, name, deptId, 0);
		super.setAddress(new Address(flatNo, bldName, area, city));
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;		
	}
	
	
	@Override
	public double netSalary() {
		return grossSales * commissionRate;
	}
	
	public String toString() {
		return "CommissionEmployee [grosssale=" + grossSales
				+ ", commissionRate=" + commissionRate + ", netSalary()="
				+ netSalary() + " toString()= "+ super.toString()+"]";
		
	}
}
