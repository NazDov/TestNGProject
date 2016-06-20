package com.softserveinc.edu.ita.testngpractice.test.parameterizedtest;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import com.softserveinc.edu.ita.testngpractice.EmailValidator;

public class EmailValidatorTest {
	
	private EmailValidator emailValidator;
	
  @BeforeClass
  public void init() {
	  emailValidator = new EmailValidator();
  }
  
  @DataProvider
  public Object[][] invalidEmailProvider(){
	  
	  return new Object[][]{{new String []{"nazdov",
				"nazdov@.com.ua",
				"nazdov@gmail.a",
				".nazdov@gmail.com",
				"nazdov()*@gmail.com",
				"nazdov..2012@gmail.com",
				"nazdov@%gmail.com",
				"nazdov.@gmail.com",
				"nazdov@nazdov@gmail.com"}}};
  }
  
  
  @Test(dataProvider="invalidEmailProvider")
  public void invalidEmailTest(String [] emailList) { 
	  
	  for(String email: emailList){
		  
		  boolean valid = emailValidator.validate(email);
		  
		  System.out.println("email :"+email+ " is valid: "+valid);
		  
		  Assert.assertEquals(false, valid);
	  }
	  
  }
}
