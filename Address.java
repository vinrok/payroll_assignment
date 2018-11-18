package com.atossyntel.payrollassignment;

public class Address {
	private int flatNo;
	private String bldName;                      
	private String area;
	private String city;
	
	public Address() {
		
	}

	 public Address(int flatNo, String bldName, String area, String city) {
		this.flatNo = flatNo;
		this.bldName = bldName;
		this.area = area;
		this.city = city;
	} 

	/**
	 * @return the flatNo
	 */
	public int getFlatNo() {
		return flatNo;
	}

	/**
	 * @param flatNo the flatNo to set
	 */
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	/**
	 * @return the bldName
	 */
	public String getBldName() {
		return bldName;
	}

	/**
	 * @param bldName the bldName to set
	 */
	public void setBldName(String bldName) {
		this.bldName = bldName;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Address [ flatNo= "+getFlatNo()+" bldName= "+getBldName()+" area="+getArea()+" city="+getCity()+" ]";
	}
}
