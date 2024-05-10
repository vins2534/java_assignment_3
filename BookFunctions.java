package assignment3_books;

import java.util.*;

public class BookFunctions 
{
	
	ArrayList<Book> bookshelf = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addBook()
	{
		System.out.print("Enter number of books that you want to add: ");
		int noOfBooks = sc.nextInt();
		System.out.println("Enter Books/s");
		for(int i = 0; i < noOfBooks; i++)
		{
			System.out.print("Enter Book Id: ");
			int id = sc.nextInt();
			System.out.print("Enter Book Name: ");
			String name = sc.next();
			System.out.print("Enter Book Price: ");
			double p = sc.nextDouble();
			Book b = new Book(id, name, p);
			bookshelf.add(b);
		}
	}
	
	public void printBooksDetails()
	{
		System.out.println("-----------Book Details------------");
		for (int i = 0; i < bookshelf.size(); i++)
		{
			printBook(i);
		}
	}
	
	private void printBook(int i)
	{
		System.out.println("Book Id\t Book Name\t Book Price");
		System.out.println(bookshelf.get(i).getBkid() + "\t" + 
				bookshelf.get(i).getBkName() + "\t" + 
				bookshelf.get(i).getBkPrice());
	}
	
	public void printBookToString()
	{
		System.out.println("-----------Book Details------------");
		String list = bookshelf.toString();
		System.out.println(bookshelf);
	}
	
	
	
	public void deleteBook()
	{
		System.out.print("Enter Book ID for deleting the book: ");
		int bkid = sc.nextInt();
		System.out.println("Book Id" + "\t" + "Book Name" + "\t" + "Book Price");
		
		
		for(int i = 0; i < bookshelf.size(); i++)
		{
			if(bookshelf.get(i).getBkid() == bkid)
			{
				bookshelf.remove(i);
			}
			else
			{
				System.out.println("Book not available");
			}
		}
	}
	
}
