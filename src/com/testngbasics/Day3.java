package com.testngbasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3
{

	@Test(groups= {"Smoke"})
    public void mobilecarloan()
	{
		System.out.println("mobile car loan");
	}
	
	@Test(dataProvider="getdata")
	public void webcarloan(String uid,String pwd)
	{
		System.out.println("web car loan"+uid+pwd);
	}
	@Test(dependsOnMethods={"mobilecarloan","webcarloan"})
	public void apicarloan()
	{
		System.out.println("api car loan");
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="firstuser";
		data[0][1]="12345";
		data[1][0]="seconduser";
		data[1][1]="1234";
		data[2][0]="thirduser";
		data[2][1]="123";
		return data;
	}

}
