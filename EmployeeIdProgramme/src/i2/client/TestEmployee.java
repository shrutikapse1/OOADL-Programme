package i2.client;

import i2.logic.Date;
import i2.logic.Employee;
import i2.logic.Name;

public class TestEmployee {

	public static void main(String[] args) {
		// //// Name name = new Name("Shruti", "Hansraj", "Kapse");
		// Employee emp = new Employee("Shruti", "Hansraj", "Kapse");
		// System.out.println("\t::Employee 1::");
		// emp.getName().displayFirstName();
		// emp.getName().displayMidNameInitial();
		// emp.getName().displayLastName();
		// emp.getName().displayFullName();
		// System.out.println();
		// emp.displayEmployeeIdLastName();
		// System.out.println();
		// emp.displayEmployeeIdFullName();
		//
		// //// Name name1 = new Name("Riya", "Shyam", "Patil");
		// Employee emp1 = new Employee("Riya", "Shyam", "Patil");
		// System.out.println("----------------------------------");
		// System.out.println("\t::Employee 2::");
		// emp.getName().displayFirstName();
		// emp.getName().displayMidNameInitial();
		// emp.getName().displayLastName();
		// emp.getName().displayFullName();
		// System.out.println();
		// emp1.displayEmployeeIdLastName();
		// System.out.println();
		// emp1.displayEmployeeIdFullName();
		// System.out.println();
		// ==============================================================================
		
		Employee emp1 = new Employee("Siddhi", "Shyam", "Patil",7,10,1981, 12, 03, 2001);
		Employee emp2 = new Employee("Riya", "jeet", "Jadhav",12,3,1980, 7, 12, 2000);
		Employee emp3 = new Employee("Sakshi", "meet", "Chavan",14,9,1990, 4, 7, 2003);
		Employee emp4 = new Employee("Ram", "geet", "Wagh",30,5,1995, 4, 8, 2010);
		Employee emp[] = new Employee[4];
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;
		emp[3] = emp4;

		for (int i = 0; i < 4; i++) {
			System.out.println("\t::Employee " + (i + 1) + " ::");
			emp[i].getName().displayFirstName();
			emp[i].getName().displayMidNameInitial();
			emp[i].getName().displayLastName();
			emp[i].getName().displayFullName();
			System.out.println();
			emp[i].displayEmployeeIdLastName();
			System.out.println();
			emp[i].displayEmployeeIdFullName();
			System.out.println();
			System.out.print("Date Of Joining:");
			emp[i].getDOJ().displayDate();
			System.out.print("Date Of Retirement:");
			emp[i].getDOB().displayRetirementDate();
			System.out.println("----------------------------------");
		}
	}

}
