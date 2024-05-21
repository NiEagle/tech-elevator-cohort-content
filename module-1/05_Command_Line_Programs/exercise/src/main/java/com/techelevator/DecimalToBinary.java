package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner decimalScanner = new Scanner(System.in);
		System.out.println("type");
		String decimalString = decimalScanner.nextLine();
		String[] stringParts =decimalString.split(" ");

		String binaryNumber = "";

		for(int i =0; i < stringParts.length; i++ ) {
			int decimalAsAInt = Integer.parseInt(stringParts[i]);

		for (int j = 0; decimalAsAInt >= 1; j++) {

			if (decimalAsAInt % 2 == 0) {
				binaryNumber = binaryNumber + "1";
			} else if (decimalAsAInt % 2 != 0) {
				binaryNumber = binaryNumber + "0";
			}
			decimalAsAInt = decimalAsAInt / 2;
		}
		System.out.println(stringParts[i] + " in binary is " + binaryNumber + ".");
		binaryNumber = "";

	}
	}
}

//	public static void main(String[] args) {
//		Scanner decimalScanner = new Scanner(System.in);
//
//
//		Scanner decimalScanner = new Scanner(System.in);
//
//		String[] numbers = decimalString.split(" ");
//		String binaryNumber = "";
//		for (int i = 0; i < numbers.length; i++) {
//			int numberToConvert = Integer.valueOf(numbers[i]);
//
//			for (int j = 0; numberToConvert >= 1; j++){
//				if ((numberToConvert % 2) == 0) {
//					binaryNumber = binaryNumber + "0";
//
//
//				}
//
//			binaryNumber = binaryNumber + "1";
//			numberToConvert = numberToConvert / 2;
//
//
//		}
//		System.out.println(numbers[i] + " in binary is " + binaryNumber);
//
//	}
//
//		}
//
//	}
// format works
//package com.techelevator;
//
//import java.util.Scanner;
//
//public class DecimalToBinary {
//
//	public static void main(String[] args) {
//		Scanner decimalScanner = new Scanner(System.in);
//
//
//		System.out.println("Please enter in a series of decimal values (separated by spaces)");
//
//		String decimalString = decimalScanner.nextLine();
//
//		String[] numbers = decimalString.split(" ");
//
//		for(int i = 0; i < numbers.length; i++){
//			System.out.println(numbers[i] + " in binary is ");
//		}
//
//
//
//
//	}
//
