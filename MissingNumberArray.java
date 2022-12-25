/*
* Assignments-18
* Date : 09/12/2022
* Program-1
* 1. Suppose You have given an integer array containing 1 to n but
one of the number from 1 to n in the array is missing. You need to provide
optimum solution to find the missing number. Number can not be repeated in the array.
*/

package com.velocity.assignment18;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		
		  // Array declared and initialized
		int array[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
		
		int size = array.length;
		
		// checking number from 1 to max number in array
		for(int a = 1; a <= size; a++) {
			
			// variable to count the occurrence of number
			          int count = 0;
			
			// a loop to compare each array element
			for(int u = 0; u < size ; u++) {
				
	// condition to check number present with array element
				if(a == array[u]) {
					
					count++;
				}
			}
			
	// if the number is not present i.e count is zero 
			     if(count == 0) {
			    	 
			    	// Print the number
			   System.out.println(" Missing number in Given Array is >> " + a);
			}
		  }
		}
      }
