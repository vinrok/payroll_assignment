package com.atossyntel.payrollassignment;

public class PartWorker extends Employee {

	private int partsMade;
	private double ratePerPart;
	
	public PartWorker(int id, String name, String deptId, double basic, int partsMade, double ratePerPart, int flatNo, String bldName, String area, String city) {
		super(id, name, deptId, basic);
		super.setAddress(new Address(flatNo, bldName, area, city));
		this.partsMade = partsMade;
		this.ratePerPart = ratePerPart;
	}

	@Override
	public double netSalary() {
		return getBasic() + (partsMade * ratePerPart);
	}
	
	public String toString() {
		return "PartWorker [partsMade= "+partsMade+", ratePerPart="+ratePerPart+", netSalary()="+netSalary()+" toString()= "+ super.toString()+"]";
	}

}
