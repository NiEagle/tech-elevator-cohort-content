package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner fibScanner = new Scanner(System.in);
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//		Please enter a number: 34
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		String messageLength = "Please enter a number: ";
		System.out.println(messageLength);
		String response = fibScanner.next();
		int sum = 0;
		int num1 = 1;
		int num2 = 1;
		String sumsString = "0, 1, 1";

		int numberAsAnInt = Integer.parseInt(response);

		if (numberAsAnInt <= 0) {
			System.out.println("0, 1");

		}
		else if (numberAsAnInt > 0) {
			for (int i = 0; sum < numberAsAnInt; i++) {
				sum = num1 + num2;
				sumsString = sumsString + ", " + sum;

				num1 = sum;
				sum = num1 + num2;
				if (sum < numberAsAnInt) {
					sumsString = sumsString + ", " + sum;
				}
				num2 = sum;
			}

			System.out.println(sumsString);
		}
	}
}
	//works
//package com.techelevator;
//
//import java.util.Scanner;
//
//public class Fibonacci {
//
//	public static void main(String[] args) {
//		Scanner fibScanner = new Scanner(System.in);
////		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
////		Please enter a number: 34
////		0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//		String messageLength = "Please a number ";
//		System.out.println(messageLength);
//		String response = fibScanner.next();
//		int sum = 0;
//		int num1 = 1;
//		int num2 = 1;
//		String sumsString = "0";
//
//		int numberAsAnInt = Integer.parseInt(response);
//		for(int i = 0; sum < numberAsAnInt;i++){
//			sum = num1 + num2;
//			sumsString = sumsString + " , " + sum;
//
//			num1 = sum;
//			sum = num1 + num2;
//			sumsString = sumsString + " , " + sum;
//
//			num2 = sum;
//
//		}
//		System.out.println(sumsString);
//	}

