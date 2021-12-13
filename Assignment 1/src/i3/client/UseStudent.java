package i3.client;

import i3.logic.Student;

public class UseStudent {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Shruti","Kapse",'F',99.99);
		System.out.println("Roll No.=" + student1.getRollNo());
		System.out.println("First Name=" + student1.getFirstName());
		System.out.println("Last Name=" + student1.getLastName());
		System.out.println("Gender=" + student1.getGender());
		System.out.println("Percentage="+student1.getPercentage());
		student1.setPercentage(100);
		System.out.println("Percentage="+student1.getPercentage());
	}

}
