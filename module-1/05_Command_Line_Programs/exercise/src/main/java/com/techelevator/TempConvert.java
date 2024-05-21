package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner lengthScanner = new Scanner(System.in);

		String messageTemp = "What is the temperature?";
		System.out.println(messageTemp);
		String TempAsAString = lengthScanner.nextLine();

		String messageTempType = "Is the temperature in (C)elsius, or (F)ahrenheit?";
		System.out.println(messageTempType);
		String TempTypeAsAString = lengthScanner.nextLine();
		if (TempTypeAsAString.contains("F")||TempTypeAsAString.contains("f")) {

			double userNumberAsDouble = Double.parseDouble(TempAsAString);
			int convertedTemp = (int) ((userNumberAsDouble - 32) / 1.8);
			//(temperatureFahrenheit - 32) / 1.8

			System.out.println(TempAsAString + "F" + " is " + convertedTemp + "C");


		} else {
			double userNumberAsDouble = Double.parseDouble(TempAsAString);

			int convertedTemp = (int) ((userNumberAsDouble  * 1.8) + 32);
			//(temperatureFahrenheit - 32) / 1.8

			System.out.println(TempAsAString + "F" + " is " + convertedTemp + "C");

		}
	}
}