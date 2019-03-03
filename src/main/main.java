package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int choice;
		
//		
//		[1] Add two numbers
//		[2] Subtract two numbers
//		[3] Display your name
//		
		System.out.println("Add two number, pick 1");
		System.out.println("Subtract two number, pick 2");
		System.out.println("Display your name, pick 3");
		
		choice = input.nextInt();
		
		if(choice==1)
		{
			int num1 = 4;
			int num2 = 3;
			System.out.print(num1 + num2 );
		}
		
		if(choice==2)
		{
			int num3 = 10;
			int num4 = 5;
			System.out.print(num3 + num4);
		}
		
		if(choice==3)
		{
			String Name;
			System.out.print("Enter your name");
			Name = input.next();
			System.out.print("my name is " + Name);
		}
		
		
		
		
		
		
		
		
		
		
		
		switch (choice) 
		{ 
			case 1:
				int num1 = 4;
				int num2 = 3;
				System.out.print(num1 + num2 );
				
			break;
			
			case 2:
				int num3 = 10;
				int num4 = 5;
				System.out.print(num3 + num4);
			break;
			
			case 3:
				String Name;
				System.out.print("Enter your name");
				Name = input.next();
				System.out.print("my name is " + Name);
			break;
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
