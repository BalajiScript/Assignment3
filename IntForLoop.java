package testHomeWork;

import java.util.Arrays;
import java.util.List;

public class IntForLoop {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		for (int i = 0; i < num.size(); i++) {

			System.out.print(num.get(i)+" ");
		}
	}

}
