package pg4;

import java.util.Scanner;

class publisher{
	String publisherName;
	public publisher(String publisherName) {
		this.publisherName=publisherName;
	}
}

class Book extends publisher{
	String author;
	int price;
	public Book(String author,String publisherName,int price) {
		super(publisherName);
		this.author=author;
		this.price=price;
	}
}

class Literature extends Book{
	String BookName, Genre;
	public Literature(String BookName,String author,String publisherName,int price,String Genre) {
		super(publisherName,author,price);
		this.BookName=BookName;
		this.Genre=Genre;
	}
	public void display() {
		System.out.println("Book Name:"+BookName+
				"\nAuthor:"+author+
				"\nPublisher:"+publisherName+
				"\nprice:"+price+
				"\nGenre:"+Genre);
	}
}

class Fiction extends Book{
	String BookName, Genre;
	public Fiction(String BookName,String author,String publisherName,int price,String Genre) {
		super(publisherName,author,price);
		this.BookName=BookName;
		this.Genre=Genre;
	}
	public void display() {
		System.out.println("Book Name:"+BookName+
				"\nAuthor:"+author+
				"\nPublisher:"+publisherName+
				"\nprice:"+price+
				"\nGenre:"+Genre);
	}
}

public class main {
	
	public static void main(String a[]) {
		Scanner s= new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter the Choice: \n1.Literature \n2.Fiction");
			ch=s.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter the Book Name, Author, Publisher, Price, Genre");
			Literature lit = new Literature(s.next(),s.next(),s.next(),s.nextInt(),s.next());
			lit.display();
			break;
			case 2: System.out.println("Enter the Book Name, Author, Publisher, Price, Genre");
			Fiction fic = new Fiction(s.next(),s.next(),s.next(),s.nextInt(),s.next());
			fic.display();
			break;
			default: System.out.println("ENTER A VALID CHOICE!!!!!");
			}
		}while(ch!=0);
	}

}
