package com.techelevator;

import java.util.Scanner;


public class LinearConvert {

	public static void main(String[] args) {
		Scanner lengthScanner = new Scanner(System.in);

		String messageTemp = "What is the length?";
		System.out.println(messageTemp);
		String LengthAsAString = lengthScanner.nextLine();

		String messageTempType = "Is the length in (M)eters, or (F)eet?";
		System.out.println(messageTempType);
		String LengthTypeAsAString = lengthScanner.nextLine();
		if (LengthTypeAsAString.contains("M") || LengthTypeAsAString.contains("m") ) {

			double userNumberAsDouble = Double.parseDouble(LengthAsAString);
			int convertedLengthMeter = (int) ((userNumberAsDouble  * 3.2808399));

			System.out.println(LengthAsAString + "M" + " is " + convertedLengthMeter + "F.");


		} else {
			double userNumberAsDouble = Double.parseDouble(LengthAsAString);

			int convertedLengthFeet = (int) ((userNumberAsDouble * 0.3048));


			System.out.println(LengthAsAString + "F" + " is " + convertedLengthFeet + "M.");

		}
	}

	}


