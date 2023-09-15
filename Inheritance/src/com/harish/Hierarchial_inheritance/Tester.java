package com.harish.Hierarchial_inheritance;

public class Tester extends Developer
{
	public Tester()
	{
		employeeName = "Harish";
		role = "Automation Tester";
		salary = 35000;
		
		System.out.println("Tester name is :"+employeeName);
		System.out.println("Employee salary is :"+salary);
		System.out.println("Employee role is :"+role);
				
	}
}
