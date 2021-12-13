package i2.logic;

public class CallRecord {
	private Date dateCallMade;
	private long receiverMobileNo;
	private int durationOfCall;

	public CallRecord(Date dateCallMade, long receiverMobileNo, int durationOfCall) {
		this.dateCallMade = dateCallMade;
		this.receiverMobileNo = receiverMobileNo;
		this.setDurationOfCall(durationOfCall);
	}

	public void displayCallRecord() {
		
		dateCallMade.displayDate();
		System.out.print("\t\t"+receiverMobileNo + "\t\t  " + getDurationOfCall() + " Sec \t\t");
		System.out.println();
	}

	public int getDurationOfCall() {
		return durationOfCall;
	}

	public void setDurationOfCall(int durationOfCall) {
		this.durationOfCall = durationOfCall;
	}

}
