package com.arrays.example;

import java.util.Scanner;

public class SortArrayElements {

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
		
		System.out.println("Array elements before sorting  are : ");
		for(int index = 0; index < size; index++) {
			System.out.println("Element value at " + index + " position : " + num[index]);
		}
		
		for(int i = 0; i < size; i++) {
			
			for(int j = i+1; j < size; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("Array elements after sorting  are : ");
		for(int index = 0; index < size; index++) {
			System.out.println("Element value at " + index + " position : " + num[index]);
		}
	}

}
