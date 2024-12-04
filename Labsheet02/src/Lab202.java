import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		 int num = input.nextInt();
		 
		 int lastNum = num -1 ;
		 while(num > lastNum) {
			 lastNum = num;
			 System.out.print("Input number : ");
			 num = input.nextInt();
		 }
		 System.out.print("\nbye bye");

	}

}
