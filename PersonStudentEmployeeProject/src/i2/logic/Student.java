package i2.logic;

public class Student extends Person {
	private int rollNo;
	private String yearOfStudy;

	public Student(String name, int rollNo, String yearOfStudy) {
		super(name);
		this.rollNo = rollNo;
		this.yearOfStudy = yearOfStudy;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public String getYearOfStudy() {
		return this.yearOfStudy;
	}

	public void displayStudentDetails() {
		System.out.println("========================================================");
		System.out.println("Name Of Student:\tRoll No:\tYear Of Study:");
		System.out.println("" + super.getName() + "\t\t\t" + this.rollNo + "\t\t\t" + this.yearOfStudy);
		System.out.println("========================================================");
	}
}
