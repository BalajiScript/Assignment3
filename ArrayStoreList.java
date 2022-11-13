package testHomeWork;

import java.util.*;

public class ArrayStoreList {

	public static void main(String[] args) {
		
		String[] a=new String[] {"abc", "bcd", "cde"};
		
		List<String> names=Arrays.asList(a);
		
		for(int i=0;i<names.size();i++) {
			
		System.out.println(names.get(i));
		
		}
		

	}

}
