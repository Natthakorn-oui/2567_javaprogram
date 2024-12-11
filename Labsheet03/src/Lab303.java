import java.util.Scanner;

public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		int spacebars = 0;
		int words = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the sentence : ");
		sentence = sc.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input the sentence, again : ");
			sentence = sc.nextLine();
		}
	
		for(int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if(ch == ' ') {
				spacebars++;
			}
			words = spacebars + 1;
		}
		System.out.print("This sentence has " + spacebars + " spacebar.\n");
		System.out.print("This sentence has " + words + " word.");
		
		sc.close();
	}

}


