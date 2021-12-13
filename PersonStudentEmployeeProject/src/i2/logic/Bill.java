package i2.logic;

public class Bill {
	private static int billNoGenerator=1;
	private int billNo;
	private int billingAmount;
    private Doctor doctor;
    private Patient patient;
	public Bill(Doctor doctor,Patient patient) {
		this.doctor=doctor;
		this.patient=patient;
		this.billNo = billNoGenerator;
		this.billingAmount = this.doctor.getVisitFee();
		billNoGenerator++;
		
	}
	public void displayBillDetails() {
		System.out.println("========================================================");
		System.out.println("Bill No:"+this.billNo);
		System.out.println("Patient Name:"+patient.getName());
		System.out.println("Doctor Name:"+doctor.getName());
		System.out.println("Billing Amount:"+this.billingAmount);
		System.out.println("========================================================");
	}
	

}
