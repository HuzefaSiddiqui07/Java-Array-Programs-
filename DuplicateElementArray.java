/*
 * Assignment 18
* Program-2
* 2. Suppose you have array that containing elements 10,20,30,10,30,50,60
* Find out duplicate elements into array and print it.
*/

package com.velocity.assignment18;

public class DuplicateElementArray {

	public static void main(String[] args) {
		
		 //Initialize array  
        int array[] = new int [] {10,20,30,10,50,60};  
        
        System.out.println(" Duplicate elements in given array >>> "); 
        
         //Searches for duplicate element  
        for(int a = 0; a < array.length; a++) {  
        	
            for(int f = a + 1; f < array.length; f++) { 
            	
      // check one element to remaining next other element for duplicate
                if(array[a] == array[f])  {
                	
                  // Printing the duplicate numbers
                    System.out.println(array[a]);  
                }  
            }  
        }
	}
 }
