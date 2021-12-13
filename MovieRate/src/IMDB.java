import java.util.Scanner;

public class IMDB {

	Scanner sc = new Scanner(System.in);

	private int usersForRating1;
	private int usersForRating2;
	private int usersForRating3;
	private int usersForRating4;
	private int usersForRating5;

	int ch;

	public void countRating() {

		do {
			System.out.println("Enter your rating from 1 to 5 for Movie ");
			int rating = sc.nextInt();

			switch (rating) {
			case 1:
				usersForRating1++;
				break;
			case 2:
				usersForRating2++;
				break;
			case 3:
				usersForRating3++;
				break;
			case 4:
				usersForRating4++;
				break;
			case 5:
				usersForRating5++;
				break;
			default:
				System.out.println("Please rate the movie from 1 to 5 ");
				break;
			}

			System.out.println("Press 1 to continue");
			ch = sc.nextInt();
		} while (ch == 1);

	}

	public double calculateAverageRating() {
		double average = 0.0;
		int totalNoOfUsers = 0;

		totalNoOfUsers = usersForRating1 + usersForRating2 + usersForRating3 + usersForRating4 + usersForRating5;
		average = ((usersForRating1 * 1) + (usersForRating2 * 2) + (usersForRating3 * 3) + (usersForRating4 * 4)
				+ (usersForRating5 * 5)) / totalNoOfUsers;
		return average;

	}

}