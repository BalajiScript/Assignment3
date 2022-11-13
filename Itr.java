package testHomeWork;

import java.util.*;

public class Itr {

	public static void main(String[] args) {

	    List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        
	    Iterator<Integer> itr = num.iterator();
 
        while (itr.hasNext()) {
        	
        	System.out.println(num); 
      } 
            
   }

}
		
