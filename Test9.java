/*
   Write a java Program to find element Pairs in given array Whose sum is equal to given number?
		IP::   Input array::{3,6,8,-8,10,8}
			   sum:: 16
	    OP:: Pairs with sum 16 are (6,10) and (8,8)
----------------------------------------------------------------------------------------------
 */
package com.app.Array;

public class Test9 {

	public static void main(String args[]) 
	{ 
		int[] arr = { 1, 5, 7, -1, 5 }; 
		int sum = 6; 
		getPairsCount(arr, sum); 
	} 

	public static void getPairsCount(int[] arr, int sum) 
	{ 

		int count = 0;

		for (int i = 0; i < arr.length; i++) 
			for (int j = i + 1; j < arr.length; j++) 
				if ((arr[i] + arr[j]) == sum) 
					count++; 

		System.out.printf("Count of pairs is %d",count); 
	}

}
