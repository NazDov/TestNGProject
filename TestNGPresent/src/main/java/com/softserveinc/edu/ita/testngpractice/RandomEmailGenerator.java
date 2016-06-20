package com.softserveinc.edu.ita.testngpractice;

import java.util.Random;

public class RandomEmailGenerator {
	
	
	/**
	 * generates a valid email template
	 * @return email template
	 */
	public String generateValid(){
		return "example@gmail.com";
	}
	
	/**
	 * generates invalid email template
	 * @return email template
	 */
	public String generateInvalidEmail(){
		return "example.@gmail.com.1a";
	}
	

}
