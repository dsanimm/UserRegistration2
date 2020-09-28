package com.JavaPractice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static  boolean check(String toCheck,String regex){
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(toCheck);
		
		if(m.find()) {
			return true;
		}
		
		else {
			return false;
			
		}
	}
	
	
	
	public static boolean checkfname(String fname) throws InvalidFirstName{
		String regex = "(^[A-Z][a-z]{2,})";
		try {
			return check(fname, regex);
		} catch (Exception e) {
			throw new InvalidFirstName("Enter A Valid First Name !");
		}
	}
	public static boolean checklname(String lname) throws InvalidLastName{
		String regex = "(^[A-Z][a-z]{2,})";
		try {
			return check(lname,regex);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new InvalidLastName("Enter A Valid Last Name !");
		}
	}
	public static boolean checkemail(String email) throws InvalidEmail {
		String regex = "^[A-za-z0-9]{1,}([.A-za-z0-9-+]*)[@]{1}([A-za-z0-9]{1,})([.A-Za-z]{1,})";
		try {
			return check(email,regex);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new InvalidEmail("Enter A Valid Email !");
		}
	}
	public static boolean checkmob(String mob) throws InvalidMobileNoException{
		String regex = "(^[0-9]{2})([\s]{1})([0-9]{10})";
		try{
			return check(mob,regex);
		} catch(Exception e) {
			throw new InvalidMobileNoException("Enter A Valid Mobile No !");

		}
	}
	public static boolean checkpass(String pass) throws InvalidPassword {
		String regex = "(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])(?=.*[A-Z])[a-zA-Z0-9$&+,:;=?@#|'<>.-^*()%!]{8,}";
		try {
			return check(pass,regex);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new InvalidPassword("Enter A Valid Password !");
		}
	}
	
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fname = sc.next();
		
		System.out.println("Enter Last Name:");
		String lname = sc.next();
		check(lname,regex);
		System.out.println("Enter Email ID:");
		String email = sc.next();
		regex =  "^[A-za-z0-9]{1,}([.A-za-z0-9-+]*)[@]{1}([A-za-z0-9]{1,})([.A-Za-z]{1,})";
		check(email,regex);
		System.out.println("Enter Mobile No.:");
		String mob = sc.nextLine();
		System.out.println(mob);
		regex =  "(^[0-9]{2})([\s]{1})([0-9]{10})";
		check(mob,regex);
		System.out.println("Password:");
		String pass = sc.next();
		regex =  "(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])(?=.*[A-Z])[a-zA-Z0-9$&+,:;=?@#|'<>.-^*()%!]{8,}";
		check(pass,regex);*/
		
		
		
	}

}



