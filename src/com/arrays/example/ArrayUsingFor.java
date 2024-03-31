package com.arrays.example;

import java.util.Scanner;

public class ArrayUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int index = 0; index < 5; index = index+1) {
			System.out.println("Enter element for " + index + " position : ");
			num[index] = scan.nextInt();
		}
		
		for(int index = 0; index < 5; index = index+1) {
			System.out.println("Element at " + index + " position : " + num[index]);
		}
	}

}
