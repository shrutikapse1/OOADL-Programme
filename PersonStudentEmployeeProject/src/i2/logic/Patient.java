package i2.logic;

public class Patient extends Person{
    private int patientId;
	public Patient(String name, int patientId) {
		super(name);
		this.patientId = patientId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void displayPatientDetails() {
		System.out.println("========================================================");
		super.displayName();
		System.out.println("Patient ID: "+this.patientId);
		System.out.println("========================================================");
	}
	
    
}
