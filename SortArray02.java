// Print the sorted array in descending order

package com.sortarray;

public class SortArray02 {

	public static void main(String[] args) {
		
		 int arr[] = {10, 30, 20, 50, 40};
	        int n = arr.length;
	        
	        // Step 1: Sort the array in ascending order
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] < arr[j+1])
	                {
	                    // swap arr[j+1] and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	 
	        // Step 2: Print the sorted array in descending order
	        System.out.println("Sorted array in descending order:");
	        for (int i=0; i<n; i++)
	            System.out.println(arr[i]);

	}

}
