package com.JavaPractice;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {

	
	//Happy
		@Test
		public void givenLastName_WhenValid_ShouldReturnTrue() {
			UserRegistration UR= new UserRegistration();
			boolean result=UR.checklname("Singh");
			org.junit.Assert.assertEquals(true,result);		
		}
		
	//Sad	
		@Test
		public void givenLastName_WhenInvalid_ShouldReturnFalse() {
			UserRegistration UR= new UserRegistration();
			boolean result=UR.checklname("Singh");
			org.junit.Assert.assertEquals(false,result);		
		}
	//Happy
		@Test
		public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.checkemail("dsanimm@gmail.com");
		org.junit.Assert.assertEquals(true,result);		
		}
	//Sad	
		@Test
		public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.checkemail("dsanimm@gmail.com");
		org.junit.Assert.assertEquals(false,result);		
		}
		//Happy
				@Test
				public void givenMobileNo_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.checkmob("91 9536985460");
				org.junit.Assert.assertEquals(true,result);		
				}
			//Sad	
				@Test
				public void givenMobileNo_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.checkmob("91 9536985460");
				org.junit.Assert.assertEquals(false,result);		
				}
				//Happy
				@Test
				public void givenPassword_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.checkpass("Dsanimm@123");
				org.junit.Assert.assertEquals(true,result);		
				}
			//Sad	
				@Test
				public void givenPassword_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.checkpass("Dsanimm@123");
				org.junit.Assert.assertEquals(false,result);	

	}



				