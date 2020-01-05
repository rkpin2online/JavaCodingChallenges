/*Write a java program to find maximum difference between two elements in given array?
		IP:: {2,5,1,7,3,9,5}
		OP:: 8
	Explanation :: The maximum difference is between 1 to 9
--------------------------------------------------------------------------------------
*/	
package com.app.Array;


class MaximumDiffrence  { 
 int maxDiff(int arr[], int arr_size)  
 { 
     int max_diff = arr[1] - arr[0]; 
     int i, j; 
     for (i = 0; i < arr_size; i++)  
     { 
         for (j = i + 1; j < arr_size; j++)  
         { 
             if (arr[j] - arr[i] > max_diff) 
                 max_diff = arr[j] - arr[i]; 
         } 
     } 
     return max_diff; 
 } 

 public static void main(String[] args)  
 { 
     MaximumDiffrence maxdif = new MaximumDiffrence(); 
     int arr[] = {1, 2, 90, 10, 110}; 
     System.out.println("Maximum differnce is " + maxdif.maxDiff(arr, 5)); 
 } 
}