package com.harish.Hierarchial_inheritance;

public class Developer extends Employee
{
	public Developer()
	{
		employeeName = "Naveen";
		role = "Developer";
		salary = 80000;
		
		System.out.println("Developer name is :"+employeeName);
		System.out.println("Employee role is :"+role);
		System.out.println("Employee salary is :"+salary);
	}
}
