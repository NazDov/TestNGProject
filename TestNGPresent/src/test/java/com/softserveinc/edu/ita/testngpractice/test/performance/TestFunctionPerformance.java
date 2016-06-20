package com.softserveinc.edu.ita.testngpractice.test.performance;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.softserveinc.edu.ita.testngpractice.Function;

public class TestFunctionPerformance {
	
	private Function function;
	private int [] arr;
	
	@BeforeClass
	public void init(){
		function = new Function();
		arr = generateArrayOfRandomMumbs(100000);
	}
	

@Test(timeOut=50)
  public void testFunctionFindMinN() { 
	  
	  int sum = function.findMinN(arr);
	  
	  System.out.println("sum: "+sum);
  }
  
  @Test(timeOut=50)
  public void testFuncFinMinN2() { 
	  
	  int sum = function.findMinN2(arr);
	  
	  System.out.println("sum: "+sum);
	  
  }
  
  
  private int[] generateArrayOfRandomMumbs(int size) {
	  arr = new int[size];
	  
	  for(int i=0; i<size-1; i++){
		  arr[i] = i+1;
	  }
	  
	  arr[size-1]=0;
	  
	  return arr;
  }
}
