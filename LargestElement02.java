// Program to print the largest element in an array (Scanner Object)

package com.largestelement.array;

import java.util.Scanner;

public class LargestElement02 {

	public static void main(String[] args) {
		
		// Declare & Initialize
		int a[] = new int [5];
		
		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Array Element");
		
		// Use For-Loop to Store Value of User Input
		for (int i = 0; i < 5; i++) {
		
			a[i] = scan.nextInt();
		}
		int max = a[0];
		
		for (int i = 1; i < 5; i++) {
			
			if (a[i] > max) {
				
				max = a[i];
			}
			
		}
		
		System.out.println("Largest element present in array >>> " + max);

	}

}
