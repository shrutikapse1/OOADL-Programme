package i2.client;
import i2.logic.Books;
import i2.logic.Library;
public class LibraryManager {

	public static void main(String[] args) {
		Books b=new Books(450,"Java");
		Books b1=new Books(250,"Cpp");
		Books b2=new Books(550,"Phython");
		Library l=new Library();
		l.addBook(b);
		l.addBook(b1);
		l.addBook(b2);
		l.removeBook(b2);
		l.displayBooksDetails();
	}

}
