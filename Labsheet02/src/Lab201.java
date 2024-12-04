import javax.swing.*;
import java.text.*;

public class Lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BUFFET = 299 ;
		int member;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many custimer per bill?"));
		
		double totalPrice = numberOfCustomer * BUFFET ;
		
		//System.out.printf("Total price is %,.2f baht.", totalPrice);
		do {
			member = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " baht." + 
					"\nDo you have member crad?");
		}
		while(member == JOptionPane.CANCEL_OPTION);;
		
		if (member == JOptionPane.YES_OPTION) {//if (member ==0)
			double priceAfterDiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be pay is " + frm.format(priceAfterDiscount) + " baht.");
		}
		else if (member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be pay is " + frm.format(totalPrice) + " baht.");
		}
		
		

	}

}
