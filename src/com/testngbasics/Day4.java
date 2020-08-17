package com.testngbasics;

import org.testng.annotations.Test;

public class Day4 
{
	@Test(groups= {"Smoke"})
    public void mobilehomeloan()
	{
		System.out.println("mobile home loan");
	}
	@Test(enabled=false)
	public void webhomeloan()
	{
		System.out.println("web home loan");
	}
	@Test
	public void apihomeloan()
	{
		System.out.println("api home loan");
	}

}
