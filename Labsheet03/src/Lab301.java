import java.util.*;

public class Lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String txtConcate = "";
		String word;
		
		while (true) {
			System.out.print("Enter word :");
			word = input.next();
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Program Terminate");
				break;
			}
			txtConcate += word + " ";
		}
		System.out.println(txtConcate.toUpperCase());
		input.close();
	}

}
