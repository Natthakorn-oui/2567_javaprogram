import javax.swing.*;

public class ShoppingCart {

	public static void main(String[] args) {
		// call method displayCartItemAndTotal
		displayCartItemAndTotal("Apple", 10.5, "Banana", 5.75, "Orange", 7.3);
		displayCartItemAndTotal("Milk", 20.0, "Bread", 15.0);
		displayCartItemAndTotal();
		
	}
	public static void displayCartItemAndTotal (Object...item) {
		if(item.length == 0) {
			System.out.println("No item in the cart.");
			return;
		}
		System.out.println("Item in the cart.");
		
		for(int i = 0;i < item.length;i+=2) {
			String itemName = (String)item[i];
			double price = (Double)item[i+1];
			
			JOptionPane.showConfirmDialog(null, "-" + itemName + ": $" + price);
			System.out.printf("- %s: $%.2f%n", itemName, price);
			
			//double totalPrice += (double)item[i+2];
			//System.out.println("");
		}
		System.out.println();
		
	}

}
