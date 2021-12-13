package i2.logic;

public class Name {
	private String firstName;
	private String midName;
	private String lastName;

	public Name(String firstName, String midName, String lastName) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
	}

	public void displayFirstName() {
		System.out.println("First Name: " + this.firstName);
	}

	public void displayMidNameInitial() {
		System.out
				.println("Mid Name: " + midName.toUpperCase().charAt(0) + ".");
	}

	public void displayLastName() {
		System.out.println("Last Name: " + this.lastName);
	}

	public void displayFullName() {
		System.out.println("Full Name:"
				+ (this.firstName + " " + midName.toUpperCase().charAt(0)
						+ ". " + this.lastName));
	}

}