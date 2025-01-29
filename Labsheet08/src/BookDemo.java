import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input author name : ");
		String authorName = input.nextLine();
		System.out.println("Input author email : ");
		String authorEmail = input.nextLine();
		
		Author author1 = new Author(authorName,authorEmail);
		
		System.out.println(author1);
		System.out.println();
		
		System.out.println("Input book title : ");
		String bookTitle = input.nextLine();
		System.out.println("Input book page : ");
		int bookPage = input.nextInt();
		
		Book book1 = new Book(bookTitle, author1, bookPage);
		
		System.out.println();
		System.out.println(book1);
		
		
	}

}
