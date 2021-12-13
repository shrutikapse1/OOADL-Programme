package i2.client;
import java.util.Scanner;
import i2.logic.Date;
import i2.logic.Student;

public class ByUserInput {
	public static void main(String[] args) {
   	 Scanner sc=new Scanner(System.in);
   	 Date[] d=new Date[2];
   	 Student[] S=new Student[2];
   	 int a,c;
   	String b,e;
   	 for(int i=0;i<S.length;i++) {
   		System.out.println("Enter Student"+(i+1)+" Roll no and Name:");
      	a=sc.nextInt();
      	b=sc.next();
      	S[i]=new Student();
   		S[i].setRollNo(a);
   		S[i].setName(b);
   		d[i]=new Date();
   		System.out.println("Enter student date of birth:");
   		System.out.println("Enter day,month and year:");
   		a=sc.nextInt();
   		e=sc.next();
   		c=sc.nextInt();
   		d[i].setDay(a);
   		d[i].setMonth(e);
   		d[i].setYear(c);
   	 System.out.println("=======================================");
   		S[i].displayStudentInfo();
   		d[i].displayDateOfBirth();
   	 System.out.println("=======================================");
   	 }
   	 
  }
}
