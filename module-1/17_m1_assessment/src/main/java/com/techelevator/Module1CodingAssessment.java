package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();
		List<MovieRental> moviesToRent = new ArrayList<>();

		MovieRental theThing = new MovieRental("The_THING","DVD",true);
		MovieRental theOtherThing = new MovieRental("The_OTHER_THING","Blue-Ray",false);
		MovieRental theReturnOfTheThing = new MovieRental("The_Return_Of_The_THING","Digital",false);

		moviesToRent.add(theThing);
		moviesToRent.add(theOtherThing);
		moviesToRent.add(theReturnOfTheThing);



	}

	private void run() {

           //start coding here... You will call other class or classes from here as needed, or write additional methods. 


	}

}
