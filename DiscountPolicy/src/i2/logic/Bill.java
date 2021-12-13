package i2.logic;

public class Bill {
	private LineItem[] noOfLineItem;
	private double BillnetPayableAmount;
	private int totalLineItem;

	public Bill(int cnt) {
		this.totalLineItem = cnt;
		noOfLineItem = new LineItem[totalLineItem];
		BillnetPayableAmount = 0;
	}

	public double calculateBillNetPayableAmount() {
		for (int i = 0; i < totalLineItem; i++) {
			this.noOfLineItem[i] = new LineItem();
			//BillnetPayableAmount = BillnetPayableAmount + noOfLineItem[i].;

		}
		return BillnetPayableAmount;
	}
}
