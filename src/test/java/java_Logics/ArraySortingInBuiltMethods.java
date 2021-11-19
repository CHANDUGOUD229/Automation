package java_Logics;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingInBuiltMethods {

	public static void main(String[] args) 
	{
		Integer a[]={10,20,30,40,5,50,90};
		
		System.out.println("Before Sorting Arry List :: " +Arrays.toString(a));
		Arrays.sort(a);
		//System.out.println("After Sorting Arry List :: " +Arrays.toString(a));
		
		
		//Using Parallelsorting We Can Sort
		Arrays.parallelSort(a);
		//System.out.println("After Sorting Arry List :: " +Arrays.toString(a));
		
		//Sorting Decending order
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("After Sorting Arry List :: " +Arrays.toString(a));
		
	}

}
