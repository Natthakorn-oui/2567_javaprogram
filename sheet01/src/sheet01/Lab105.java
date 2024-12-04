package sheet01;
import javax.swing.*;
 
public class Lab105 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cdId = JOptionPane.showInputDialog(null, "This program calculates the total cost of a CD order\\Please enter the ID of the CD",
														"Input", JOptionPane.QUESTION_MESSAGE);
		
	    String cdTitle = JOptionPane.showInputDialog(null, "Please enter the title of the CD", "Input", JOptionPane.QUESTION_MESSAGE);
	    
	    String cdPriceInput = JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars",
	    														"Input", JOptionPane.QUESTION_MESSAGE);
	    
	    double cdPrice = Double.parseDouble(cdPriceInput);
	    
	    String cdQuantityInput = JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars",
	    															"Input", JOptionPane.QUESTION_MESSAGE);
	    int cdQuantity = Integer.parseInt(cdQuantityInput);
	    double cdSubtotal = cdPrice * cdQuantity;
	    double taxRate = 0.0625;
	    double taxPer = taxRate*100;
	    double cdTotal = cdSubtotal * (1+taxRate);
	    
	    String message = "Summary of the transaction:\n\nCD ID:" + cdId + "\nCD TITLE:" + cdTitle + "\nCD Unit Price:$" + cdPrice +
	    					"\nCD Quantity:" + cdQuantity + "\n\nSubtotal:$" + cdSubtotal +
	    					"\nTax rate:" + taxPer + "\nTotal:$" + cdTotal + "\n\nEnd of Program";
	    
	   JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
 
 
	}
 
}