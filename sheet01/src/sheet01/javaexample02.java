package sheet01;
import javax.swing.*;

public class javaexample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productname = JOptionPane.showInputDialog("Input product name");
		String strproductunit = JOptionPane.showInputDialog("Input product unit");
		
		int productunit = Integer.parseInt(strproductunit);
		double productprice = Double.parseDouble(JOptionPane.showInputDialog("Input price per unit"));
		
		
		double totalpriceproduct = productunit * productprice;
		double totalwithvat = totalpriceproduct*1.07;
		String frmtotalwithvat = String.format("%,.2f",totalwithvat);
		String frmtotalpriceproduct = String.format("%,.2f",totalpriceproduct);
		
		JOptionPane.showMessageDialog(null, "Total price is "+frmtotalpriceproduct+" baht."
											+"\nAdd VAt 7% is "+frmtotalwithvat+" baht.");
		

	}

}
