package com.JavaPractice;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UserRegistrationTest2 {
	
    @Parameters(name = "{index}: fib({0})={1}")
	  public static Iterable<Object[]> data() {
	       return Arrays.asList(new Object[][] {     
	                 { "abc@yahoo.com", true }  ,{ "abc.100@yahoo.com", true } ,{ "abc.100@yahoo.com", true }
	                 ,{ "abc-100@yahoo.com", true },{ "abc111@abc.com", true },{ "abc-100@abc.net", true }
	                 ,{"abc.100@abc.com.au",true},{ "abc@1.com", true },{ "abc@gmail.com.co", true },{ "abc+100@gmail.com", true }
	           });
	        
	        
	        
	       // {,"abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net"
			//	,"abc.100@abc.com.au","abc@1.com","abc@gmail.com.co","abc+100@gmail.com"};
	        
	    }

	    private String fInput;

	    private boolean fExpected;

	    public UserRegistrationTest2(String input, boolean expected) {
	        this.fInput = input;
	        this.fExpected = expected;
	    }

	    @Test
	    public void test() {
	    	UserRegistration UR= new UserRegistration();
	    	org.junit.Assert.assertEquals(fExpected, UR.checkemail(fInput));
	    }
}














