package i2.client;
import java.util.Scanner;
import i2.logic.MusterManager;
public class MusterMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0,cnt=0,i;
		MusterManager M1 =new MusterManager(10);
		//int[] attendance= {8,7,9,10,8,7,5};//If You Want to add input without user input
		int[] attendance = new int[M1.getLogOfAttendance()];
		do {
			cnt++;
			System.out.println("\tFor Week: "+(cnt));
			for(i=0;i<M1.getLogOfAttendance();i++) {
				System.out.println("Enter Attendance Of Day: "+(i+1));
				attendance[i]=sc.nextInt();
				M1.setLogOfAttendance(attendance);		
			}
			M1.displayMusterDetails();
			M1.calculateMonthAttendance();
			if(cnt==3) {
				System.out.println("\tFor Month:");
				System.out.println("Total Month Attendance:"+M1.getMonthAttendance());
				M1.setMonthAttendance(0);
				cnt=0;
			}
			System.out.println("Do You Want To Add Atendance of Next Week Press 1...");
			ch=sc.nextInt();
		}while(ch==1);
		
		System.out.println("Thank You...");		
	}

}