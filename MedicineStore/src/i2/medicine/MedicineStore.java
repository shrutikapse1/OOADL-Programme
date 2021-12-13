package i2.medicine;
import java.util.Scanner;

class info {
	Scanner sc = new Scanner(System.in);
	String name, date;
	int id, price;

	public info() {
		name = null;
		date = null;
		price = 0;
		id = 0;
	}

	public void create() {
		System.out.println("Enter Name of medicine:");
		name = sc.next();
		System.out.println("Enter Medicine Id:");
		id = sc.nextInt();
		System.out.println("Enter Expiry Date: ");
		date = sc.next();
		System.out.println("Enter Price:");
		price = sc.nextInt();
	}

	public void display() {
		System.out.println("======================================================");
		System.out.println("\tMedicine Infomation");
		System.out.println("\tName of Medicine:" + name);
		System.out.println("\tMedicine Id:" + id);
		System.out.println("\tExpiry Date: " + date);
		System.out.println("\tPrice:" + price);
		System.out.println("\tNote:Keep Away from children");
		System.out.println("======================================================");
	}

}

public class MedicineStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, total = 0;
		System.out.println("Enter no. of medicine you want:");
		n = sc.nextInt();
		info obj[] = new info[n];
		for (int i = 0; i < n; i++) {
			obj[i] = new info();
			System.out.println("For Medicine " + (i + 1));
			obj[i].create();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\tFor Medicine " + (i + 1));
			obj[i].display();
			total = obj[i].price + total;

		}
		System.out.println("\tTotal Bill:" + total);
	}

}
