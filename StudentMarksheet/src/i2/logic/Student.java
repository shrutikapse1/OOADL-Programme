package i2.logic;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private int m[] = new int[5];
    private double avg;
    private double sum=0;
    private int rollno;
	public Student( int rollno) {	
		this.rollno = rollno;
	}
	public int[] getM() {
		return m;
	}
	public void setM(int[] m) {
		this.m = m;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public int getRollno() {
		return rollno;
	}
	public void AcceptMarks() {
		System.out.println("Enter the Marks of Student:");
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();
			
		}
	}
	public void calculateAverage() {
		for (int i = 0; i < m.length; i++) {
			sum=sum+m[i];
		}
		avg=sum/m.length;
		
	}
	public void DisplayMarks() {
		System.out.println("\t::Student Details::");
		System.out.println("==================================");
		System.out.println("\tRoll NO: "+rollno);
		for (int i = 0; i < m.length; i++) {
			System.out.println("\tSubject "+(i+1)+" Marks:"+m[i]);
		}
		System.out.println("\tAverage of Subjects:"+avg);
		System.out.println("==================================");
	}
	
	
}
