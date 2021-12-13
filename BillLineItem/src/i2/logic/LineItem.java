package i2.logic;

public class LineItem {
	private String itemName;
	private double itemPricePerUnit;
	private int quantity;
	private double subtotal;

	public LineItem(String itemName, double itemPricePerUnit, int quantity) {
		this.itemName = itemName;
		this.itemPricePerUnit = itemPricePerUnit;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPricePerUnit() {
		return itemPricePerUnit;
	}

	public void setItemPricePerUnit(double itemPricePerUnit) {
		this.itemPricePerUnit = itemPricePerUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public double computeSubtotal() {
		subtotal = itemPricePerUnit * quantity;
		return subtotal;
	}

	public void Display() {
		System.out.println("Item Name    :" + itemName);
		System.out.println("Item Price   :" + itemPricePerUnit);
		System.out.println("Item Quantity:" + quantity);
		System.out.println("Subtotal     :" + subtotal);
	}
}
