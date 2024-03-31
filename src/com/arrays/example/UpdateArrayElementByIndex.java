package com.arrays.example;

import java.util.Scanner;

public class UpdateArrayElementByIndex {

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
		
		System.out.println("Enter the index whose value to update : ");
		int indexValueToUpdate = scan.nextInt();
		
		int flag = 0;
		for(int index = 0; index < size; index++) {
			if(index == indexValueToUpdate) {
				System.out.println("Enter new value : ");
				int newValue = scan.nextInt();
				num[index] = newValue;
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.println("Required index not available");
		}
		
		System.out.println("Updated array elements are : ");
		for(int index = 0; index < size; index++) {
			System.out.println("Element value at " + index + " position : " + num[index]);
		}
	}

}
