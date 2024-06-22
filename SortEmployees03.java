package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee
{
	
	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class SortEmployees03 {

	public static Employee sortBySalary(List<Employee> employees,double salary) {
		List<Employee> result = new ArrayList<>();
		
		for(Employee e : employees) {
			if(e.salary==salary) {
				return e;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Alice",500000));
		employees.add(new Employee(2,"John",800000));
		employees.add(new Employee(3,"Charlie",60000));
		employees.add(new Employee(4,"Bob",500000));
		employees.add(new Employee(5,"David",9000));
		employees.add(new Employee(6,"Eve",40000));	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary:");
		System.out.println(sortBySalary(employees, sc.nextDouble()));
		
	}

}
