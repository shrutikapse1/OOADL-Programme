package i2.logic;

public class Student {
       private int rollNo;
       private String name;
       private Date dateOfBirth;
       public Student() {
    	   
       }
       public Student(int rollNo,String name,Date dateOfBirth) {
    	   this.dateOfBirth=dateOfBirth;
    	   this.name=name;
    	   this.rollNo=rollNo;
       }
       public void setRollNo(int rollNo) {
    	   this.rollNo=rollNo;
       }
       public void setName(String name) {
    	   this.name=name;
       } 
       public void displayStudentInfo() {
    	   System.out.println("\tName   : "+name);
    	   System.out.println("\tRoll No: "+rollNo);
    	   System.out.print("\tDate of Birth: ");
    	   dateOfBirth.displayDate();
       }
	

}
