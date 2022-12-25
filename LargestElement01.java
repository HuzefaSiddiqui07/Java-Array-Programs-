// Program to print the largest element in an array (Hard Code)

package com.largestelement.array;

public class LargestElement01 {

	public static void main(String[] args) {
		
		// Initialize Array
		int array[] = new int[] {10, 45, 37, 77, 20};
		
		// Initialize max with first element of array
		int max = array[0];
		
		// Loop through the array
		for (int a = 0; a < array.length; a++) {
			
			// Compare elements of array with max
			if (array[a] > max) {
				max = array[a];
			}
		}
		
		System.out.println("Largest element present in array >>> " + max);
		
	}
 }
