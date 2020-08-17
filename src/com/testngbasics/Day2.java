package com.testngbasics;

import org.testng.annotations.Test;

public class Day2 
{
	@Test(groups= {"Smoke"})
	public void mobileperloan()
	{
		System.out.println("mobile per loan");
	}
	@Test
	public void webperloan()
	{
		System.out.println("web per loan");
	}
	@Test
	public void apiperloan()
	{
		System.out.println("api per loan");
	}
}
