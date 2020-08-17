package com.testngbasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 
{
	@Test(groups= {"Smoke"})
	public void loanssignin()
	{
		System.out.println("loans signin hello"+"URL");
	}
	@Parameters({"URL"})
	@Test
	public void loanssignup(String url)
	{
		System.out.println("loans signup bye "+url);
	}

}
