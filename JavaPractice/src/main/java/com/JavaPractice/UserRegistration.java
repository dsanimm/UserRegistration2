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
	
	
	
	public static boolean checkfname(String fname) {
		String regex = "(^[A-Z][a-z]{2,})";
		return check(fname,regex);
	}
	public static boolean checklname(String lname) {
		String regex = "(^[A-Z][a-z]{2,})";
		return check(lname,regex);
	}
	public static boolean checkemail(String email) {
		String regex = "^[A-za-z0-9]{1,}([.A-za-z0-9-+]*)[@]{1}([A-za-z0-9]{1,})([.A-Za-z]{1,})";
		return check(email,regex);
	}
	public static boolean checkmob(String mob) {
		String regex = "(^[0-9]{2})([\s]{1})([0-9]{10})";
		return check(mob,regex);
	}
	public static boolean checkpass(String pass) {
		String regex = "(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])(?=.*[A-Z])[a-zA-Z0-9$&+,:;=?@#|'<>.-^*()%!]{8,}";
		return check(pass,regex);
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



