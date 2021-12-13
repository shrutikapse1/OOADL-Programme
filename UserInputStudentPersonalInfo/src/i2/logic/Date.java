package i2.logic;

public class Date {
    private int day;
    private String month;
    private int year;
    public Date(int day,String month,int year) {
    	this.day=day;
    	this.month=month;
    	this.year=year;
    }
    public Date() {
    	this.day=0;
    	this.month=null;
    	this.year=0;
    }
    public void setDay(int day) {
    	this.day=day;
    }
    public void setMonth(String month) {
    	this.month=month;
    }
    public void setYear(int year) {
    	this.year=year;
    }
    
    public void displayDateOfBirth() {
    	System.out.println("\tDate of Birth: "+day+" "+month+" "+year);
    }
}

