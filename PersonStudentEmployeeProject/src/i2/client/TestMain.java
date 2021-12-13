package i2.client;

import i2.logic.Person;
import i2.logic.Student;
import i2.logic.Employee;
import i2.logic.Doctor;
import i2.logic.Patient;
import i2.logic.Bill;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("\t::Student::");
		Student s = new Student("Shruti", 37, "SY");
		s.displayStudentDetails();
		System.out.println("\t::Employee::");
		Employee e = new Employee("Sita", 2637, 2021);
		e.displayEmployeeDetails();
		System.out.println("\t::Doctor::");
		Doctor d = new Doctor("Dr.Patil", "General Surgeon", 10000);
		d.displayDoctorDetails();
		Patient p=new Patient("priya",203);
		System.out.println("\t::Patient::");
		p.displayPatientDetails();
		Bill b=new Bill(d,p);
		System.out.println("\t::Bill::");
		b.displayBillDetails();

	}

}
