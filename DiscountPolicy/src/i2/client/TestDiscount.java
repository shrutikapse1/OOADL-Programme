package i2.client;

import i2.logic.Bill;
import i2.logic.BuyNItemsGetOneFree;
import i2.logic.Item;
import i2.logic.LineItem;

public class TestDiscount {

	public static void main(String[] args) {
		// BulkDiscount bd=new BulkDiscount(5,10);
		Item i = new Item("Book", 100);
		Item i1 = new Item("NoteBook", 50);
		LineItem li = new LineItem(i, 10);
		LineItem li1 = new LineItem(i1, 10);
		BuyNItemsGetOneFree f = new BuyNItemsGetOneFree(3);
		i.displayItemDetails();
		// i.setDiscountPolicy(bd);
		i.setDiscountPolicy(f);
		System.out.println("No of Items:" + li.getItemCount());
		System.out.println("Discount Obtained: " + f.computeDiscount(li.getItemCount(), i.getItemCost()) + " %");
		// System.out.println("Bulk Discount: "+bd.computeDiscount(li.getItemCount(),
		// i.getItemCost())+" %");
		System.out.println("Net Amount:" + li.calculateNetPayableAmount());
		System.out.println("==============================================");
		i1.displayItemDetails();
		// i.setDiscountPolicy(bd);
		i1.setDiscountPolicy(f);
		System.out.println("No of Items:" + li1.getItemCount());
		System.out.println("Discount Obteained: " + f.computeDiscount(li1.getItemCount(), i1.getItemCost()) + " %");
		// System.out.println("Bulk Discount: "+bd.computeDiscount(li.getItemCount(),
		// i.getItemCost())+" %");
		System.out.println("Net Amount:" + li1.calculateNetPayableAmount());
		System.out.println("==============================================");
		li.displayLineItemDetails();
		li1.displayLineItemDetails();
		int cnt=li.getCnt()+li1.getCnt();
		Bill b = new Bill(cnt);
		System.out.println("LineItems:" +cnt);
		System.out.println("Total Bill Amount:" + b.calculateBillNetPayableAmount());

	}

}
