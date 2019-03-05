package main;

import java.util.Scanner;

public class mun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Write a for loop that displays the numbers from 1-10
		//2. Ask the user for N amount of numbers, and then allow him to enter X and add them 
		// EXAMPLE FOR 2
		// How many numbers do you want to use ? : 3
		// Enter a number : 1
		// Enter a number : 3
		// Enter a number : 7
		// Sum is = 11
		
		
		//USE COMMAND : git pull origin master to get changes. 
		//Do these two problems above, and then push your code
		
	
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}	
		int n, i, sum = 0, num;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to add  ");
		n = reader.nextInt(); 
		
		for(i = 0; i < n; i++) {
			System.out.print("Enter a number : ");
			num = reader.nextInt();
			sum = sum + num;
			
		}
		System.out.print("sum of all numbers is " + sum);
	}

}
