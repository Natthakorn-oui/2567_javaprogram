package sheet03;
import java.util.*;

public class Lab306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Message : ");
		String message = sc.nextLine();
		
		if(message.toLowerCase().contains("nichi")) {
			System.out.print("Nichi is a sentence.");
		}
		else {
			System.out.print(message);
		}
		
		sc.close();
	}

}
