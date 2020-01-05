/* Write java program to find sum of unique elements in given array? 
		IP:: {1,6,4,3,2,2,3,8,1}
		OP:: 24
	(Unique elements are::1,6,4,3,2,8)     
----------------------------------------------------------------------	
*/
package com.app.Array;


import java.util.Arrays; 
  
public class Test3{ 
  
    static int findSum(int arr[], int n) { 
  
        Arrays.sort(arr); 
         
        int sum = arr[0]; 
        for (int i = 0; i < n-1; i++) { 
            if (arr[i] != arr[i + 1]) { 
                sum = sum + arr[i+1]; 
            } 
        } 
  
        return sum; 
    } 
  
    public static void main(String[] args) { 
        int arr[] = {1, 2, 3, 1, 1, 4, 5, 6}; 
        int n = arr.length; 
        System.out.println(findSum(arr, n)); 
  
    } 
}


