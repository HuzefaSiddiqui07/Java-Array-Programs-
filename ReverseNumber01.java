package com.reversenumber;
import java.util.Scanner;

public class ReverseNumber01 {

	public static void main(String[] args) {

		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int number = scan.nextInt();
		scan.close();
		
		while (number > 0) {
			
			int rem = number % 10;
			
			System.out.print(rem);
			
			number = number / 10;
		}
     }
 }
