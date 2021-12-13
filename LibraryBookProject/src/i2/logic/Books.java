package i2.logic;

public class Books {
    private int price;
    private String title;
    public Books(int price,String title){
    	this.price=price;
    	this.title=title;
    }
    public void displayBookDetails() {
    	System.out.println("Title Of Book:"+title);
    	System.out.println("Price Of Book:"+price); 	
    }
}
