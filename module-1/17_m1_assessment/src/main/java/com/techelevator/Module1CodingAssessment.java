package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		Module1CodingAssessment mca = new Module1CodingAssessment();
		mca.run();


	}

	private void run() {
		List<MovieRental> moviesToRent = new ArrayList<>();

		MovieRental theThing = new MovieRental("The_THING", "VHS", true);
		MovieRental theOtherThing = new MovieRental("The_OTHER_THING", "Blu-ray", false);
		MovieRental theReturnOfTheThing = new MovieRental("The_Return_Of_The_THING", "DVD", false);

		moviesToRent.add(theThing);
		moviesToRent.add(theOtherThing);
		moviesToRent.add(theReturnOfTheThing);

		printMovieList();

		/*
		Back in the Module1CodingAssessment class, create a private method called printMovieList that takes an ArrayList from the previous step and prints out each movie and it's data. (Hint: can you call toString()). Note: You should be 'passing' the ArrayList into this private method from the run() method. Do not write this code in the run() method.
		 */

		}

		}
           //start coding here... You will call other class or classes from here as needed, or write additional methods.



	private void  printMovieList(List<MovieRental> moviesToRent) {
	for (MovieRental m : moviesToRent) {
		System.out.println(m.toString());
	}
}
}
}
