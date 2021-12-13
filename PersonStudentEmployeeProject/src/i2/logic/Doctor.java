package i2.logic;

public class Doctor extends Person {
	private String speciality;
	private int visitFee;

	public Doctor(String name, String speciality, int visitFee) {
		super(name);
		this.speciality = speciality;
		this.visitFee = visitFee;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public int getVisitFee() {
		return this.visitFee;
	}

	public void displayDoctorDetails() {
		System.out.println("========================================================");
		super.displayName();
		System.out.println("Speciality:" + this.speciality);
		System.out.println("Visit Fee :" + this.visitFee);
		System.out.println("========================================================");
	}
}
