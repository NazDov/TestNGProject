package com.softserveinc.edu.ita.testngpractice.test.parameterizedtest;

import static org.testng.AssertJUnit.*;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MathSqrtTest {
	
	@DataProvider
	public Object [][] dataProvider(){
	
		return new Object[][]{{9.0,3.0}, {16.0,4.0}, {-1.0, Double.NaN}, {0,0}};
	}
	
	
  @Test(dataProvider="dataProvider")
  public void testSqrtFunction(double argument, double expResult) {
	  
	  double actualResult =Math.sqrt(argument);
	  
	  System.out.println("sqrt() func of "+argument+" = "+actualResult);
	  
	  assertEquals(expResult, actualResult);
  }
}
