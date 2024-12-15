package sheet03;
import java.util.*;

public class Lab305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input some sentence : ");
		sentence = sc.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = sc.nextLine();
		}
		
		System.out.println();
		sc.close();
		
		String[] split = sentence.split(" ");
		
		for(int i = 0; i < sentence.length(); i++) {
			 System.out.println(split[i]);
		}
	}

}
