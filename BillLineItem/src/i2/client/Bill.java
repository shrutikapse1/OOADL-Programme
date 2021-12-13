package i2.client;
import java.util.Scanner;
import i2.logic.LineItem;
public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int Quantity;
		double price;
		LineItem purchasedItems=new LineItem("Pen",20,2);
		double subtotal=purchasedItems.computeSubtotal();
		purchasedItems.Display();
		
		
//		LineItem[] purchasedItems1;
//		System.out.println("Enter Number of Items you want to Buy:");
//		int n=sc.nextInt();
//		System.out.println("Enter the Object name");
//		name=sc.next();
//		
//		for(int i=0;i<n;i++) {
//			purchasedItems1[i]=new LineItem();
//			purchasedItems1[i].setItemName(name);
//			
//		}
	}

}
