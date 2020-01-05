/* Write a java Program to find min and max elements in given elements?
		IP::- 1,2,5,5,6,6,7,2
		OP::-  Min:1  Max:7             
------------------------------------------------------------------------		
 */
package com.app.Array;

public class Test6{


	static int getMin(int arr[], int i, int n) 
	{ 
		return (n == 1) ? arr[i] : Math.min(arr[i], getMin(arr,i + 1 , n - 1)); 
	} 

	static int getMax(int arr[], int i, int n) 
	{ 
		return (n == 1) ? arr[i] : Math.max(arr[i], getMax(arr ,i + 1, n - 1)); 
	} 

	public static void main(String[] args)  
	{ 
		int arr[] = { 12, 1234, 45, 67, 1 }; 
		int n = arr.length; 
		System.out.print("Minimum element of array: " +getMin(arr, 0, n) + "\n"); 
		System.out.println("Maximum element of array: " +getMax(arr, 0, n)); 
	} 
}
