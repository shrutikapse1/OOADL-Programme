package i2.logic;

public class IMDB {
	private int rating1;
	private int rating2;
	private int rating3;
	private int rating4;
	private int rating5;
	private int noRating;
	private double totalNoOfUsers;
	private double averageRating;

	public IMDB() {
		rating1 = 0;
		rating2 = 0;
		rating3 = 0;
		rating4 = 0;
		rating5 = 0;
		noRating = 0;
		totalNoOfUsers = 0;

	}

	public void giveRating(int ch) {
		switch (ch) {
		case 1:
			rating1 = rating1 + 1;
			break;
		case 2:
			rating2 = rating2 + 1;
			break;
		case 3:
			rating3 = rating3 + 1;
			break;
		case 4:
			rating4 = rating4 + 1;
			break;
		case 5:
			rating5 = rating5 + 1;
			break;
		default:
			noRating = noRating + 1;
			break;
		}
		totalNoOfUsers = this.rating1 + rating2 + rating3 + rating4 + rating5 + noRating;
	}

	public double calculateAverageRating() {
		double totalUserWhoRated=0;
		totalUserWhoRated=totalNoOfUsers-noRating;
		averageRating = (1 * rating1 + 2 * rating2 + 3 * rating3 + 4 * rating4 + 5 * rating5 + 0 * noRating)
				/ totalUserWhoRated;
		return averageRating;
	}

	public double getTotalNoOfUsers() {
		return this.totalNoOfUsers;
	}

}
