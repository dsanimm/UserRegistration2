package com.JavaPractice;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {
	//Happy
			@Test
			public void givenFirstName_WhenInValid_ShouldReturnTrue() throws InvalidFirstName {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result=UR.checkfname(null);
					org.junit.Assert.assertEquals(true,result);
				} catch (InvalidFirstName e) {
					// TODO Auto-generated catch block
					org.junit.Assert.assertEquals("Enter A Valid First Name !",e.getMessage());
					System.out.println(e.getMessage());
				}		
			}
			
			//Happy
			@Test
			public void givenLastName_WhenInValid_ShouldReturnTrue() throws InvalidLastName {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result=UR.checklname(null);
					org.junit.Assert.assertEquals(true,result);
				} catch (InvalidLastName e) {
					// TODO Auto-generated catch block
					org.junit.Assert.assertEquals("Enter A Valid Last Name !",e.getMessage());
					System.out.println(e.getMessage());
				}		
			}
			//Happy
			@Test
			public void givenEmail_WhenInValid_ShouldReturnTrue() throws InvalidEmail {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result=UR.checkemail(null);
					org.junit.Assert.assertEquals(true,result);
				} catch (InvalidEmail e) {
					// TODO Auto-generated catch block
					org.junit.Assert.assertEquals("Enter A Valid Email !",e.getMessage());
					System.out.println(e.getMessage());
				}		
			}
			//Happy
			@Test
			public void givenMobileNo_WhenInValid_ShouldReturnTrue() throws InvalidMobileNoException {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result=UR.checkmob(null);
					org.junit.Assert.assertEquals(true,result);
				} catch (InvalidMobileNoException e) {
					// TODO Auto-generated catch block
					org.junit.Assert.assertEquals("Enter A Valid Mobile No !",e.getMessage());
					System.out.println(e.getMessage());
				}		
			}
			//Happy
			@Test
			public void givenPassword_WhenInValid_ShouldReturnTrue() throws InvalidPassword {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result=UR.checkpass(null);
					org.junit.Assert.assertEquals(true,result);
				} catch (InvalidPassword e) {
					// TODO Auto-generated catch block
					org.junit.Assert.assertEquals("Enter A Valid Password !",e.getMessage());
					System.out.println(e.getMessage());
				}		
			}
		
			
}

				