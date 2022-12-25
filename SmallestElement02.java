// Program to print the smallest element in an array (Scanner Object)

package com.smallestelement.array;

import java.util.Scanner;

public class SmallestElement02 {

	public static void main(String[] args) {
		
		// Declare & Initialize
		int j[] = new int [5];
				
	   // Create Scanner Object
	Scanner scan = new Scanner(System.in);
				
	System.out.println("Enter Array Element");
				
	// Use For-Loop to Store Value of User Input
		for (int u = 0; u < 5; u++) {
				
			j[u] = scan.nextInt();
		}
		   int min = j[0];
				
		for (int i = 1; i < 5; i++) {
					
			if (j[i] < min) {
						
				min = j[i];
		   }
					
		}
				
	System.out.println("Smallest element present in array >>> " + min);
  }

}
