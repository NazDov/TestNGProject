package com.softserveinc.edu.ita.testngpractice;

import java.util.regex.Pattern;

public class EmailValidator {
	/**
	 * regex string for email validation
	 */
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * pattern object used to validate a string against 
	 * the compiled pattern
	 */
	private static Pattern pattern;

	
	static {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}
	/**
	 * the method check validity of a given String email
	 * @param email to be validated
	 * @return true if valid, false if not valid
	 */
	public boolean validate(String email) {

		return pattern.matcher(email).matches();
	}

}
