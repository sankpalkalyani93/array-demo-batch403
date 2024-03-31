package com.arrays.example;

import java.util.Scanner;

public class CalculateTotalOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size for array : ");
		int size = scan.nextInt();
		
		int sum = 0;
		int[] num = new int[size];
		System.out.println("Enter array elements : ");
		for(int index = 0; index < size; index++) {
			System.out.println("Enter value for " + index + " position : ");
			num[index] = scan.nextInt();
			sum += num[index];
		}
		
		System.out.println("Entered array elements are : ");
		for(int index = 0; index < size; index++) {
			System.out.println("Element value at " + index + " position : " + num[index]);
		}
		
		System.out.println("Summation of array elements : " + sum);
	}

}
