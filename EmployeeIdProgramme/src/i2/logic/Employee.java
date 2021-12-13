package i2.logic;

public class Employee {
	static int cnt;
	private int employeeId;
	private Name name;
	private Date doj;
	private Date dob;

	public Employee(String fName, String mName, String lName, int day,
			int month, int year,int day1,
			int month1, int year1) {
		name = new Name(fName, mName, lName);
		dob=new Date(day,month,year);
		doj = new Date(day1, month1, year1);
		employeeId = 0;
		setName(name);
		setDOJ(doj);
		setDOB(dob);
	}

	public static int increamentCounter() {
		cnt = 1 + cnt;
		return cnt;
	}

	public Date getDOJ() {
		return this.doj;
	}

	public void setDOJ(Date date) {
		this.doj = date;
	}
	public Date getDOB() {
		return this.dob;
	}

	public void setDOB(Date date) {
		this.dob = date;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void displayEmployeeIdLastName() {
		setEmployeeId(increamentCounter());
		System.out.println("Employee ID:" + getEmployeeId());
		name.displayLastName();
	}

	public void displayEmployeeIdFullName() {
		System.out.println("Employee ID:" + getEmployeeId());
		name.displayFullName();

	}
}
