package com.softserveinc.edu.ita.testngpractice.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.softserveinc.edu.ita.testngpractice.EmailValidator;
import com.softserveinc.edu.ita.testngpractice.RandomEmailGenerator;

public class RandomEmailGeneratorTest {
	
	
	
  @Test
  public void testEmailGenerator() {
	  //given
	  RandomEmailGenerator emailGenerator = new RandomEmailGenerator();
	  //when
	  String actualResult = emailGenerator.generateValid(); 
	  String expectedResult = "example@gmail.com"; 
	  //then
	  Assert.assertEquals(actualResult, expectedResult );
		  
  }
  
  @Test
  public void testInvalidEmailGenerator(){
	  
	  //given
	  RandomEmailGenerator randomEmailGen = new RandomEmailGenerator();
	  EmailValidator emailValidator = new EmailValidator();
	  
	  //when
	  String generateInvalidEmail = randomEmailGen.generateInvalidEmail();
	  System.out.println("testing email: "+generateInvalidEmail);
	  boolean expectedValidityCond = emailValidator.validate(generateInvalidEmail);
	  
	  //then
	  Assert.assertFalse(expectedValidityCond, "is invalid");
	  
  }
  
  
  
}