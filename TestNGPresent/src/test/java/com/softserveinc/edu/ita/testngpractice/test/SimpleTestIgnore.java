package com.softserveinc.edu.ita.testngpractice.test;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * 
 * showing how to ignore tests in TestNG
 * @author Nazar
 *
 */
public class SimpleTestIgnore {
	
	
  @Test(enabled=false)
  public void ignoredTest() {
	  // this test method is still in development, thats why it was ignored
  }
  
  @Test
  public void workingTest(){
	  
	  Assert.assertTrue(true);
	  
  }
  
}
