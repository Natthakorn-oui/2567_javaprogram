package sheet01;
import javax.swing.*;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String min = JOptionPane.showInputDialog(null, "Input Time Parkink (minute):", "Input", JOptionPane.QUESTION_MESSAGE);
		
		int minute = Integer.parseInt(min);
		int hour = minute/60;
		int remainingMin = minute%60;
		double priceprehour = 50;
		double pricepermin = 0.25;
		double totalprice = (priceprehour * hour) + (pricepermin * remainingMin);
		
		String message = "You parking " + hour + " Hour " + remainingMin + " Minute." + "\nAmount to be paid is " + totalprice + " baht.";
	    JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);

	}

}
