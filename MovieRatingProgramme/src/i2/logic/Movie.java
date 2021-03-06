package i2.logic;

import java.util.Scanner;

public class Movie {
	private String name;
	private double imdbRating;

	public Movie() {
		//IMDB imdb = new IMDB();
	}

	IMDB imdb = new IMDB();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getImdbRating() {
		return this.imdbRating;
	}

	public void setImdbRating(double rating) {
		// imdb.giveRating();
		imdbRating = imdb.calculateAverageRating();
		this.imdbRating = rating;
	}

	public void displayMovieDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Movie Name :" + this.name);
		int ch;
		do {
			System.out.println("Give Rating to Movie From 1-5:");
			ch = sc.nextInt();
			imdb.giveRating(ch);
			setImdbRating(ch);
			System.out.println("Do You want to continue press 1");
			ch = sc.nextInt();
		} while (ch == 1);
		System.out.println("===========================================");
		System.out.println("Movie Name :" + this.name);
		System.out.println("IMDB Rating:" + imdb.calculateAverageRating());
		System.out.println("Total Number Of Users:" + imdb.getTotalNoOfUsers());
		System.out.println("===========================================");
	}
}
