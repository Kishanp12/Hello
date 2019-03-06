package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers =  {2,1,4,1,6,5,999,11,17,9,4,0};
		int[] numbers2 =  {2,1,4,4,6,5,999,11,17,9,4,0};
		int[] numbers3 =  {2,1,31,6,5,999,41,17,9,4,0};
		
		
		print_array(even(numbers));
		print_array(even(numbers2));
		print_array(even(numbers3));
		
		
		int[] even_number = even(numbers);
		
		print_array(even_number);
	}
	public static int[] even(int[] numbers) {
		
		
		ArrayList<Integer> even = new ArrayList<>();
		
	
		// numbers , even , odd
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				even.add(numbers[i]);
			}
		}
		
		int[] actual_array = new int[even.size()];
		
		for(int i = 0; i < actual_array.length; i++) {
			actual_array[i] = even.get(i);
		}
		
		return actual_array;
		
	}
	
	public static void print_array(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] );
		}
	}
	
	public static void even_numbers() {

		int[] numbers =  {2,1,4,1,6,5,999,11,17,9,4,0};
		ArrayList<Integer> even = new ArrayList<>();
		int[] odd = new int[numbers.length];
		// numbers , even , odd
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				even.add(numbers[i]);
			} else {
				odd[i] = numbers[i];
			}
		}
		
		for(int i = 0; i < even.size();i++) {
			System.out.println(even.get(i));
		}
	}

}
