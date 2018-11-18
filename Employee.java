package com.atossyntel.payrollassignment;


public abstract class Employee {
	private int id;
	private String name;
	private String deptId;
	private Address address = new Address();
	private double basic;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String deptId, double basic) {
		this.setId(id);
		this.setName(name);
		this.setDeptId(deptId);
		this.setBasic(basic);				       
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the deptId
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the basic
	 */
	public double getBasic() {
		return basic;
	}

	/**
	 * @param basic the basic to set
	 */
	public void setBasic(double basic) {
		this.basic = basic;
	}	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "Employee [id="+getId()+" name="+name+" deptId="+deptId+" basic="+basic+ " address= "+ address+ "]";
	}
	
	abstract public double netSalary();
}
