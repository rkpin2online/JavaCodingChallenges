/*Write a java program to find super elements in given integer array. 
   If no super element is presented then print output as "No Super Elements".

   Super Element : The element which contains at least two greater elements is called Super Element.

      Example : 1, 5, 3, 6

        Output : 1 and 3 are super elements 

     Explanation : 

       1 : 1 is having 3,5,6 as greater elements so it is super element

       5 : 5 is having only 6 as greater so it is not super element 

       3 : 3 is having 5 and 6 as greater so it is super element 

       6 : 6 doesn't have any greater element so it is not super element.
*/
package com.app.Array;

import java.util.Arrays;

public class Test16 {
	 
	  
	static void findElements(int arr[], int n) 
	{ 
	    Arrays.sort(arr); 
	  
	    for (int i = 0; i < n - 2; i++) 
	    System.out.print(arr[i] + " "); 
	} 
	  
	public static void main(String args[]) 
	{ 
	    int arr[] = { 2, -6 ,3 , 5, 1}; 
	    int n = arr.length; 
	    findElements(arr, n); 
	  
	  } 
	} 


 