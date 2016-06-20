package com.softserveinc.edu.ita.testngpractice.test.dependencies;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SimpleTestDependency {
  @Test(groups={"init"})
  public void serverStartedOK() {
  }
  
  @Test(groups={"init"})
  public void initEnvironment(){
	  Assert.assertTrue(false);
  }
  @Test(dependsOnGroups={"init.*"})
  public void method1(){
	  System.out.println("do something....");
  }
  
}
