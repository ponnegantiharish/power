package com.harish.multi_Levelinheritance;

public class PCM extends Science
{	
	protected int math;
	
	public PCM(int sid,String sname,String addr,int phy,int che,int mat)
	{
		studentId = sid;
		studentName = sname;
		sAddr = addr;
		physics = phy;
		chemistry = che;
		math = mat;
		
	}
	
	public void showData()
	{
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(sAddr);
		System.out.println(physics);
		System.out.println(chemistry);
		System.out.println(math);
	}
	
	public void showResult()
	{
		int total = physics+chemistry+math;
		System.out.println("Toatal marks is :"+total);
	}
}
