package com.softserveinc.edu.ita.testngpractice.test.testsuit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBConfig {
  
	@BeforeSuite()
	public void beforeSuite() {
		System.out.println("@BeforeSuite - server loading up....");
	}

	@AfterSuite()
	public void afterSuite() {
		System.out.println("@AfterSuite - server shutting down....");
	}

	@BeforeTest()
	public void beforeTest() {
		System.out.println("@BeforeTest - accessing server pool ");
	}

	@AfterTest()
	public void afterTest() {
		System.out.println("@AfterTest - closing server pool");
	}
	
	
}
