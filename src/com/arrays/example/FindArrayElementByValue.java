package com.arrays.example;

import java.util.Scanner;

public class FindArrayElementByValue {

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
		for(int index = 0; index < size; index++) {
			System.out.println("Element value at " + index + " position : " + num[index]);
		}
		
		System.out.println("Enter the value to find in array : ");
		int valueToFind = scan.nextInt();
		
		int flag = 0;
		for(int index = 0; index < size; index++) {
			if(num[index] == valueToFind) {
				System.out.println("Value " + valueToFind + " found at index : " + index);
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.println("Value " + valueToFind + " not found");
		}
	}

}
