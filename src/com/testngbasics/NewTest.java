package com.testngbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest 
{
	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  System.out.println("beforesuite newtest");
	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("beforetest newtest");
	  }
	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("beforeclass newtest");
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("beforemethod newtest");
	  }
      @Test
      public void a() 
      {
	  System.out.println("atest newtest");
      }
      @Test
      public void b()
      {
    	  System.out.println("btest newtest2");
      }
      @AfterMethod
      public void afterMethod() 
      {
	  System.out.println("aftermethod newtest");
      }
      @AfterClass
      public void afterClass()
      {
	  System.out.println("afterclass newtest");
      }
      @AfterTest
      public void afterTest()
      {
	  System.out.println("aftertest newtest");
      }
     @AfterSuite
     public void afterSuite() 
     {
	  System.out.println("aftersuite newtest");
     }

}
