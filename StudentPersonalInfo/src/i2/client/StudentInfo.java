package i2.client;

import i2.logic.Date;
import i2.logic.Student;
public class StudentInfo {
     public static void main(String[] args) {
    	 
    	 Date d1=new Date(16,"June",2006);
    	 Date d2=new Date(8,"March",2004);
    	 Student S1=new Student(101,"Shruti",d1);
    	 Student S2=new Student(1,"adi",d2);
    	 S1.displayStudentInfo();
    	 System.out.println("\n=======================================");
    	 S2.displayStudentInfo();
    	 
   }
}
