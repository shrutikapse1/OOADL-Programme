package i2.logic;

public class LineItem {

	private Item item;
	private int itemCount;
	private double netPayableAmount;
	private int cnt;
	private double total;

	public double getTotal() {
		return total;
	}

	public LineItem(Item item, int itemCount) {
		this.item = item;
		this.itemCount = itemCount;
		netPayableAmount = 0;
		cnt = 0;
		total=0;
	}

	public LineItem() {

	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getNetPayableAmount() {
		return netPayableAmount;
	}

	public void setNetPayableAmount(double netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public double calculateNetPayableAmount() {
		double totalAmount = this.item.getItemCost() * this.itemCount;
		double discount = this.item.getDiscountPolicy().computeDiscount(this.itemCount, this.item.getItemCost());
		netPayableAmount = totalAmount - (this.itemCount * discount);
		total=total+netPayableAmount;
		setNetPayableAmount(netPayableAmount);
		cnt++;
		setCnt(cnt);
		return netPayableAmount;
	}
	public void displayLineItemDetails() {
		item.displayItemDetails();
		System.out.println("No Of Items:"+itemCount);
		System.out.println("Discount Obtained:"+item.getDiscountPolicy().computeDiscount(itemCount, item.getItemCost()));
		System.out.println("Payable Amount:"+netPayableAmount);
		System.out.println("==========================================================");
	}

}
