// Program to print the smallest element in an array (Hard Code)

package com.smallestelement.array;

public class SmallestElement01 {

	public static void main(String[] args) {
		
		// Initialize Array
	int array[] = new int[] {10, 45, 37, 77, 20};
				
		// Initialize max with first element of array
			int min = array[0];
				
		// Loop through the array
	for (int a = 0; a < array.length; a++) {
					
	  // Compare elements of array with max
			if (array[a] < min) {
			min = array[a];
		}
					
	}
				
	System.out.println("Smallest element present in array >>> " + min);
	  }

}
