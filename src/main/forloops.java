package main;

import java.util.Scanner;

public class forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//5
		// 5 - 4 - 3- 2- 1 - 0
		int reader;
		//get user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		// save the input
		reader = scan.nextInt();
		
		// for loop
		
		//Ask the user for a number X . Then display a triangle with the number of rows the user enters .
				// Example
				// x = 4
				// output: 
				// x
				// xx
				// xxx
				// xxxx
				//
				//
				//
				// xxxx
				// xxx
				// xx
		
		
	 //    *  
	 //   * *
	 //	 * * *
	 // * * * *

		//
		//
		//
		//
		
		
		
		int spaces = reader;
for(int row = 0; row < reader; row++) {
		
		spaces--;
			
			for (int col = 0; col < spaces; col ++) {
				System.out.print(" ");
			}
			
			int stars = reader - spaces;
			
			for(int col = 0; col < stars; col++) {
				System.out.print(" x");
			}
			
				
			System.out.println(" ");
		}
		
		
		

		//triangle(reader);
		
			
		
		
	}
	
	public static void triangle_greater(int reader) {
		for(int row = reader; row > 0; row--) {
			
			
			for(int col = 0; col < row; col++) {
				System.out.print("x");
			}
				
			System.out.println("");
		}
		
		
	}
	
	public static void triangle(int reader) {
		for(int row = 0; row < reader; row++ ) {
			
			for(int col = 0; col < row; col++) {
				System.out.print("x");
			}
				
			System.out.println("");
		}
	}
	
	

}
