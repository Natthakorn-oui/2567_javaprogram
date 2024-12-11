import javax.swing.*;

public class Lab303_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		int spacebars = 0;
		int words = 0;
		
		sentence = JOptionPane.showInputDialog(null, "Input a sentence:");

		
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog(null, "Input a sentence, again:");
		}
	
		for(int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if(ch == ' ') {
				spacebars++;
			}
			words = spacebars + 1;
		}
		JOptionPane.showMessageDialog(null, "This sentence has " + spacebars + " spacebar.\n" + 
										"This sentence has " + words + " word.");

		
	}

}
