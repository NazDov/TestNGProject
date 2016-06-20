package com.softserveinc.edu.ita.testngpractice.test.exceptions;

import org.testng.annotations.Test;

public class TestMathExcRuntime {
  
	
  @Test(expectedExceptions=ArithmeticException.class)
  public void testDivisionByZero() {
	  
	  int i = 1 / 0;
	  
  }
}
