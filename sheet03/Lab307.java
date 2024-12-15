package sheet03;
import java.util.*;

public class Lab307 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Text : ");
	        String text = sc.nextLine().replace(" ", "").toLowerCase();

	        String reversed = "";
	        for (int i = text.length() - 1; i >= 0; i--) {
	            reversed += text.charAt(i);
	        }

	        if (text.equals(reversed)) {
	            System.out.println("It is palindrome.");
	        }
	        else {
	            System.out.println("It is not palindrome.");
	        }

	        sc.close();
	}

}
