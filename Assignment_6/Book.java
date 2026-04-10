import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	public static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		int choice;
		System.out.println("\n0.Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Sort all books by price in desc order");
		System.out.println("Enter the Choice");
		choice = sc.nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) {
		int choice;
		List<Book> list = new ArrayList<>();
				
		while((choice = menuList())!=0) {
			switch(choice) {
				case 1:
				{
					System.out.println("ISBN : ");
					String isbn = sc.next();
					System.out.println("Price : ");
					double price = sc.nextDouble();
					sc.nextLine();
					System.out.println("Author Name : ");
					String author = sc.nextLine();
					System.out.println("Quantity : ");
					int qnt = sc.nextInt();
					Book b  = new Book(isbn, price, author, qnt);
					list.add(b);
				}
				break;
				case 2:
					for (Book book : list) {
						System.out.println(book.toString());
					}
					break;
				case 3:
					for(int i = list.size()-1; i>=0 ;i--) {
						System.out.println(list.get(i)); 
					}
					break;
				case 4:
					System.out.println("Enter the Index : ");
					int i = sc.nextInt();
					list.remove(i);
					break;
				case 5:
					list.sort((x,y)->Double.compare(y.getPrice(), x.getPrice()));
					for (Book book : list) {
						System.out.println(book.toString());
					}
					break;
			}
		}
	}
	
		
		
		
		
		
		

	}


