package testHomeWork;

import java.util.*;

public class ListBoolean {

	public static void main(String[] args) {
		
        List<String> Auto = Arrays.asList("Web Automation", "API Automation", "Mobile Automation");
        
        	String aut="Mobile";
        	
        	if (Auto.contains(aut)){
  
		 System.out.println("True");
			
		} 
		else {
			System.out.println("False");
	  }

    }
	
 }
//Write a program which will display true if list contains Mobile else prints false