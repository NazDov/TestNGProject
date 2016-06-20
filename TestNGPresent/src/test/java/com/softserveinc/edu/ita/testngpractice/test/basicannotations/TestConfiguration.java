package com.softserveinc.edu.ita.testngpractice.test.basicannotations;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class TestConfiguration {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass - initializing connection");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass - closing connection");
	}
	
	
	@BeforeGroups("saveData")
	public void beforeGroup(){
		
		System.out.println("@BeforeGroups - preparation before saving data....");
	}
	
	
  @Test(groups={"saveData"})
  public void testSaveData() {
	  System.out.println("@Test - save data into db");
  }
  
  @Test
  public void testSendData(){
	  System.out.println("@Test - sending data to server");
  }
  
  
  @AfterGroups("saveData")
  public void completeSaveData(){
	  System.out.println("@AfterGroups - successfully saved data");
  }
  
  
  @BeforeMethod()
  public void beforeMethod() {
	  System.out.println("@BeforeMethod - opening stream");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod - closing stream");
  }





}
