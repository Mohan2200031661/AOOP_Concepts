package com;

public class Dependent 
{
	private Addition addiclsobj_in;
//Constructor Dependency Injection
	public Dependent(Addition addiclsobj_out) 
	{
	      System.out.println("Inside Dependent constructor, Injecting the Addition Object." );
	      this.addiclsobj_in = addiclsobj_out;
	}
	public void adding(int a, int b) 
	{
		addiclsobj_in.summing(a,b);
	}
}
