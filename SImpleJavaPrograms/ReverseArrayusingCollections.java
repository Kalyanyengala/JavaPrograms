package SImpleJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayusingCollections
{
	public static void main(String[] args)
	{
		Integer Array[] = {1,2,3,4,5,6,7};
		List<Integer> list = Arrays.asList(Array);
		Collections.reverse(list);
		System.out.println("Printing reversedList:" + list);
	}

}
