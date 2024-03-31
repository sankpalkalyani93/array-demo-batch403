package com.arrays.example;

import java.util.Scanner;

public class EnhancedForLoopInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size for array : ");
		int size = scan.nextInt();
		
		int[] num = new int[size];
		System.out.println("Enter array elements : ");
		for(int index = 0; index < size; index++) {
			System.out.println("Enter value for " + index + " position : ");
			num[index] = scan.nextInt();
		}
		
		System.out.println("Entered array elements are : ");
		for(int arrayElement : num) {
			System.out.println(arrayElement);
		}
	}

}
