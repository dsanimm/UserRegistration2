package com.JavaPractice;

public class InvalidMood extends Exception{
	enum ExceptionType{
		Entered_Null,Entered_Empty
	}
	ExceptionType type;
	private static final long serialVersionUID = 1L;
	public InvalidMood(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}
}

