/* Write a Java program to find the Leader element from an given array of integers. 
   
   Leader element: A Leader element is an element that appears more than n/2 times where n is the size of the array.

   Note: 

       If more than one leader element is presented then print highest number from those.
       If no Leader element present in the given array then print "Leader Element Doesn't Exist".

          Input : { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };

          Output : 7
*/

package com.app.Array;

public class Test15 {
	 void printLeaders(int arr[], int size)  
	    { 
	        for (int i = 0; i < size; i++)  
	        { 
	            int j; 
	            for (j = i + 1; j < size; j++)  
	            { 
	                if (arr[i] <= arr[j]) 
	                    break; 
	            } 
	            if (j == size) 
	                System.out.print(arr[i] + " "); 
	        } 
	    } 
	  
	    public static void main(String[] args)  
	    { 
	    	Test15 lead = new Test15(); 
	        int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
	        int n = arr.length; 
	        lead.printLeaders(arr, n); 
	    }
}
