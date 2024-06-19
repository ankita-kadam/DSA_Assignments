package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

// Create array of employees and search employee by i. empid ii. name iii. salary

class Employee{
	int empid;
	String name;
	double salary;
	
	public Employee(int empid,String name,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee {empid=" + empid + ", name=" + name + ", salary=" + salary + "}";
	}
}


public class EmployeeSearch04 {

	public static void main(String[] args) 
	{
		List<Employee> employees =new ArrayList<>();
		employees.add(new Employee(1, "Alice",500000));
		employees.add(new Employee(2,"John",800000));
		employees.add(new Employee(3,"Charlie",60000));
		employees.add(new Employee(4,"Bob",500000));
		employees.add(new Employee(5,"David",9000));
		employees.add(new Employee(6,"Eve",40000));	
	
		System.out.println(searchByEmpid(employees, 3));
		System.out.println(	searchByName(employees, "Eve"));
		System.out.println(searchBySalary(employees, 500000));
		
	}
	
	
	public static Employee searchByEmpid(List<Employee> employees,int empid) 
	{
		for(Employee employee:employees) {
			if(employee.empid == empid)
			{
				return employee;
			}
		}
		return null;
	}
	
	public static List<Employee> searchByName(List<Employee> employees,String name)
	{
		List<Employee> result = new ArrayList<>();
		
		for(Employee employee:employees) {
			if(employee.name.equalsIgnoreCase(name)) {
				result.add(employee);
			}
		}
		return result;	
	}
	
	public static List<Employee> searchBySalary(List<Employee> employees,double salary)
	{	
		List<Employee> result  =new ArrayList<>();
		
		for(Employee employee: employees) {
			if(employee.salary==salary) {
				result.add(employee);
			}
		}
		
		return result;
	}
}


