package com;

public class Main {

	public static void main(String[] args) 
	{
		Addition ad = new Addition();
		Dependent dp = new Dependent(ad);
		dp.adding(10,200);
		

	}

}
