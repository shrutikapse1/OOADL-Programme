package i2.client;
import i2.logic.CallRecord;
import i2.logic.Date;
import i2.logic.MobileBill;
public class MobileBillManager {

	public static void main(String[] args) {	
		Date d=new Date(3,"March",2021);
		Date d1=d;
		Date d2=new Date(5,"March",2021);
		Date d3=new Date(8,"March",2021);
		Date d4=new Date(13,"March",2021);
		CallRecord c=new CallRecord(d,784512647,12);
		CallRecord c1=new CallRecord(d1,994758668,120);
		CallRecord c2=new CallRecord(d2,91457896,78);
		CallRecord c3=new CallRecord(d3,747896542,45);
		CallRecord c4=new CallRecord(d4,747896542,45);
		MobileBill m=new MobileBill(997845621,"Shruti");
		m.addCallRecord(c);
		m.addCallRecord(c1);
		m.addCallRecord(c2);
		m.addCallRecord(c3);
		m.addCallRecord(c4);
		m.displayTotalDurationOfCalls();
		m.displayMobileBill();
		
//		System.out.println();
//		d.displayDate();
//		System.out.println(d.getDay());
		
	}

}
