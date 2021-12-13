package i3.logic;

public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private char gender;
	private double percentage;

	public Student(int rollNo, String firstName, String lastName, char gender, double percentage) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.percentage = percentage;
	}

	public Student() {

	}
	// setter or mutator methods to change the attributes
	// getter or accessor methods to get or access or display the attributes

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public char getGender() {
		return gender;
	}

}
