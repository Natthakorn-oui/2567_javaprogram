import java.util.*;

public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int x = input.nextInt();
		System.out.print("Input value of Y : ");
		int y = input.nextInt();
		
		while(x > y) {
			System.out.print("Input value of Y, again : ");
			y = input.nextInt();
		}
		
		System.out.println("\n");
		int sum = x;
		
		for(int i = x ; i < y ; i++) {
			System.out.println((sum) + "+" + y + "=" + (sum + (i+1)) );
			sum =(sum + (i+1));
		}
		input.close();
	}

}
