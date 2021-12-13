package i2.logic;

import java.util.ArrayList;

public class MobileBill {
	private ArrayList<CallRecord> listOfCallRecords;
	private long userMobileNo;
	private String name;
	int totalNoOfCalls;
	int totalDurationOfCalls;
	public MobileBill(long userMobileNo, String name) {
		this.userMobileNo = userMobileNo;
		this.name = name;
		this.listOfCallRecords = new ArrayList<CallRecord>();
		this.totalNoOfCalls = 0;
		this.totalDurationOfCalls=0;
	}

	public void addCallRecord(CallRecord c) {
		listOfCallRecords.add(c);
		totalNoOfCalls++;
	}

	public void displayMobileBill() {
		System.out.println("------------------------Bill Details---------------------------");
		System.out.println("User Mobile No    :" + userMobileNo);
		System.out.println("User Name         :" + name);
		System.out.println("================================================================");
		System.out.println("   Date:\t   Receiver Mobile No:\t\tDuration Of Call: ");
		System.out.println("================================================================");
		for (int i = 0; i < listOfCallRecords.size(); i++) {
			CallRecord c = listOfCallRecords.get(i);
			listOfCallRecords.get(i).displayCallRecord();
		}
		System.out.println("================================================================");
		System.out.println("Total No of Calls :" + totalNoOfCalls);
		System.out.println("Total Duration of Calls:"+totalDurationOfCalls);
		

	}
	public void displayTotalDurationOfCalls() {
		for (int i = 0; i < listOfCallRecords.size(); i++) {
			CallRecord c = listOfCallRecords.get(i);
			totalDurationOfCalls=totalDurationOfCalls+listOfCallRecords.get(i).getDurationOfCall();
		}
		
	}

}
