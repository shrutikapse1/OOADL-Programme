package i2.logic;

import java.util.ArrayList;

public class Library {
	private ArrayList<Books> listOfBooks = new ArrayList<Books>();
	private int totalNoOfBooks;

	public Library() {
		totalNoOfBooks = 0;
	}

	public void addBook(Books b) {
          this.listOfBooks.add(b);
          totalNoOfBooks++;
	}

	public void removeBook(Books b) {
         this.listOfBooks.remove(b);
	}

	public void displayBooksDetails() {
		for(int i=0;i<this.listOfBooks.size();i++) {
			Books b=listOfBooks.get(i);
			System.out.println("========================");
			listOfBooks.get(i).displayBookDetails();
		}
		
	}
}
