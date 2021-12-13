package i2.logic;

public class MusterManager {
      private int totalFacultyMembers;
      private int[] logOfAttendance;
      private int total;
      private int monthAttendance;
      public MusterManager(int totalFacultyMembers){
    	  this.totalFacultyMembers=totalFacultyMembers;
    	  this.logOfAttendance= new int[7];
    	  total=0;
    	  monthAttendance=0;
      }
      public int getMonthAttendance() {
    	  return this.monthAttendance;
      }
      
      public void setMonthAttendance(int monthAttendance) {
		this.monthAttendance = monthAttendance;
	}
	public int getLogOfAttendance() {
    	  return this.logOfAttendance.length;
      }
      
      public void setLogOfAttendance(int[] logOfAttendance) {
		this.logOfAttendance = logOfAttendance;
	  }
      public void calculateMonthAttendance() {
    	  monthAttendance=monthAttendance+total;
      }
	  public void displayMusterDetails() {
		  total=0;
		  System.out.println("\t::Muster Details::");
		  System.out.println("===========================================");
		  System.out.println("\tTotal Faculty Members: "+totalFacultyMembers);
		  System.out.println("\t1 Log = 1 week Attendance");
		  for(int i=0;i<logOfAttendance.length;i++) {
			  System.out.println("\tAttendance of day-"+(i+1)+": "+logOfAttendance[i]); 
			  total=total+logOfAttendance[i];
		  }
		  System.out.println("Total Week Attendance:"+total+" out of 70");
		  System.out.println("===========================================");
	  }
}
