package com.softserveinc.edu.ita.testngpractice.test;

import org.testng.Assert;

import org.testng.annotations.Test;

public class SimpleTest {
  @Test
  public void testMethod() {
	  //  object to test
	  String s = "this test has passed";
	  // verifying expected result against actual
	  Assert.assertEquals("this test has passed", s);
	  
  }
}
