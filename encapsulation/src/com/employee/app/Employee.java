package com.employee.app;

public class Employee {
	private int empId;
	private String name;
	private String salary;
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	public int getempId() {
		return empId;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setsalary(String salary) {
		this.salary = salary;
	}
	public String getsalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setempId(10);
		emp.setname("Shubhangi");
		emp.setsalary("35000");
		System.out.println(emp.getempId()+"\t"+emp.getname()+"\t"+emp.getsalary());
	}

}
