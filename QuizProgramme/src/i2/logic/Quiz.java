package i2.logic;
import java.util.Scanner;
public class Quiz {
   private int maxMarks;
   private int totalStudent;
   private int[] marksObtained;
   private int total;
   
   public Quiz(int maxMarks, int totalStudent) {
	this.maxMarks = maxMarks;
	this.totalStudent = totalStudent;
	
}
   public Quiz() {
		
		
	}

   public int[] getMarksObtained() {
	return marksObtained;
}

public void setMarksObtained(int[] marksObtained) {
	this.marksObtained = marksObtained;
}

public int addMarks() {
	   total=0;
	   Scanner sc=new Scanner(System.in);
	   marksObtained=new int[5];
	   System.out.println("Enter the Marks For Subjects:");
	   for(int i=0;i<5;i++) {
		   marksObtained[i]=sc.nextInt();
		   total=total+marksObtained[i];
	   }
	   sc.close();
	   return total;
   }
   public void displayQuizDetails() {
	   System.out.println("===========================================");
	   System.out.println("\t::Marks Obtained::");
	   for(int i=0;i<5;i++) {	   
		   System.out.println("\tSubject "+(i+1)+": "+this.marksObtained[i]);
	   }
	   System.out.println("\tTotal:"+this.total+"/500");
	   System.out.println("===========================================");
	   System.out.println("\tTotal Students:"+this.totalStudent);
	   System.out.println("\tMaximum Marks(Topper):"+this.maxMarks+"/500");
	   
	   
   }
}
