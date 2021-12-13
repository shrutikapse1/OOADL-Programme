package i2.logic;

public class Employee extends Person {
	private int employeeId;
	private int yearOfJoining;

	public Employee(String name, int employeeId, int yearOfJoining) {
		super(name);
		this.employeeId = employeeId;
		this.yearOfJoining = yearOfJoining;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void displayEmployeeDetails() {
		System.out.println("========================================================");
		System.out.println("Name Of Employee:\tEmployee ID:\tYear Of Joining:");
		System.out.println("" + super.getName() + "\t\t\t" + this.employeeId + "\t\t\t" + this.yearOfJoining);
		System.out.println("========================================================");
	}

}
