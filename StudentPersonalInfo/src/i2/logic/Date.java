package i2.logic;

public class Date {
	private int day;
	private String month;
	private int year;

	public Date(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
		this.day = 0;
		this.month = null;
		this.year = 0;
	}

	public void displayDate() {
		System.out.print(" " + day + " " + month + " " + year);
	}
}
