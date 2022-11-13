package testHomeWork;

import java.util.*;

public class ListOfNumbers {

	public static void main(String[] args) {
		
		List<Integer>num=new ArrayList<>();
		num.add(33);
		num.add(44);
		num.add(55);
		num.add(66);
		num.add(77);
		num.add(88);
		
	   //Remove second element from list using index//
		System.out.println(num.remove(2));
	
		//Remove second element from list using value//
		System.out.println(num.get(2));
		
		//Add 90 at index 3
		num.add(3,90);
		System.out.println(num);
		
		//Get the length of list
		System.out.println(num.size());
		
		//Print all values from list using any values
		System.out.println(num);
		
		//Convert List into array
		Integer[] intArray=new Integer[num.size()];
		intArray=num.toArray(intArray);
		
		for(Integer i:intArray)
			
			System.out.print(i+" ");

	}

}
