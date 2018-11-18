package com.atossyntel.payrollassignment;

public class SalariedEmployee extends Employee {

	private double hra;
	private double da;
	
	public SalariedEmployee(int id, String name, String deptId, double basic, double hra, int flatNo, String bldName, String area, String city) {
		super(id, name, deptId, basic);
		super.setAddress(new Address(flatNo, bldName, area, city));
		this.hra = hra;
		this.da = 0.20 * basic;
	}

	@Override
	public double netSalary() {
		return getBasic() + hra + da;
	}
	
	public String toString() {
		return "Salaried Employee [hra= "+hra+", da= "+da+", netSalary= "+netSalary()+" toString()= "+ super.toString()+"]";
	}

}
