package com.JavaPractice;

/**
 * Hello world!
 *
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static void main( String[] args )
    {
        final Logger logger = LogManager.getLogger(App.class);

    	//System.out.println( "Hello World!" );
        logger.info("Hello from Log4j 2 first time");

        
        
    }
}
