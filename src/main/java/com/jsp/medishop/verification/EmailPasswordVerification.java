package com.jsp.medishop.verification;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class EmailPasswordVerification 
{
	public String verifyEmail(String email)
	{
		Boolean alphabet = Pattern.compile("[a-zA-Z]").matcher(email).find();
		Boolean number = Pattern.compile("[0-9]").matcher(email).find();
		Boolean special = Pattern.compile("[@.]").matcher(email).find();
		
		if(alphabet && number && special)
		{
			return email;
		}
		else {
			return null;
		}

	}
	public String verifyPassword(String password)
	{
		Boolean alphabet = Pattern.compile("[a-zA-Z]").matcher(password).find();
		Boolean number = Pattern.compile("[0-9]").matcher(password).find();
		Boolean special = Pattern.compile("[@.]").matcher(password).find();
		
		int length = password.length();
		
		if((alphabet && number && special)&&(length>=8 && length<=16))
		{
			return password;
		}
		else {
			return null;
		}

	}

}
