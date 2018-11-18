package com.atossyntel.payrollassignment;

import java.util.Scanner;

public class Payroll {
	private static final int SIZE = 5;
	private Employee[] employees = new Employee[SIZE];
	private static int counter = 0;
	
	public void addEmployee(Employee employee) {
		if(counter < SIZE) {
			employees[counter] = employee;
			counter++;
			System.out.println("Employee added");
		}
		else {
			System.out.println("Array is full");
		}
	}
	
	public void showEmployee(int employeeId) {
		for (int i = 0; i < counter; i++) {
			if(employees[i].getId() == employeeId) {
				System.out.println("Id is= "+employees[i].getId());
				System.out.println("Name is= "+employees[i].getName());
				System.out.println("DeptId is= "+employees[i].getDeptId());
				System.out.println("Basic is= "+employees[i].getBasic());
				System.out.println("Address is= "+ employees[i].getAddress().getFlatNo() +", "+ employees[i].getAddress().getBldName() +", "+ employees[i].getAddress().getArea() +", "+ employees[i].getAddress().getCity());
			}
		}
	}
	
	public void showAllEmployees() {
		System.out.println("EMPLOYEES DETAILS--");
		System.out.println("=====================");
		for (Employee e : employees) {
			if (e != null) {
				System.out.println(e);
			}
		}
	}
	
	public void showEmployeeMaxSalary() {
		double maxsal = 0;
		String empName=" ";
		for(int i=0; i<counter; i++){
			if(employees[i].netSalary()>maxsal){
				maxsal=employees[i].netSalary();				
			}
			empName = employees[i].getName();			
	}
		System.out.println("Employee "+empName+" with MAX SALARY:" +maxsal);
	}
	
		
	public static void main(String[] args) {
		Payroll p = new Payroll();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		while(!choice.equals("6")) {
			System.out.println("Payroll System");
			System.out.println("===============");
			System.out.println("1.1 Enter Salaried Employee Details");
			System.out.println("1.2 Enter Part Worker Details");
			System.out.println("1.3 Enter Commisioned Employee Details");
			System.out.println("2. Show Employee");
			System.out.println("3. Show All Employee");
			System.out.println("4. Show Employee with maxSalary");
			System.out.println("5.Exit");
			
			choice = sc.next();
			
			switch (choice) {
			case "1.1":
				System.out.println("Enter id, name, deptId, basic, hra, flat, bldName, area, city");

				SalariedEmployee se = new SalariedEmployee(sc.nextInt(),
						sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextInt(), sc.next(), sc.next(), sc.next());
				
						
				p.addEmployee(se);

				break;
				
			case "1.2":
				System.out.println("Enter id, name, deptId, basic, no of Parts made, rate Per Part, flat, bldName, area, city ");

				PartWorker pw = new PartWorker(sc.nextInt(), sc.next(),
				sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.next(), sc.next(), sc.next());
		
				
				
				p.addEmployee(pw);
		
				break;
				
			case "1.3":
				System.out.println("Enter id, name, deptId, grosssales, commisssion, flat, bldName, area, city");
		
				CommissionedEmployee ce = new CommissionedEmployee(sc.nextInt(),
				sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextInt(), sc.next(), sc.next(), sc.next());

				
				
				p.addEmployee(ce);
				
		
				break;
				
			case "2":
				System.out.println("Enter Employee id");
				

				p.showEmployee(sc.nextInt());

				break;
			
			case "3":
				
				   p.showAllEmployees();
				
				break;
			
			case "4":
				
				p.showEmployeeMaxSalary();
				
				break;
				
			case "5":
				
				break;

			default: return;
			}
		}
	}
}
