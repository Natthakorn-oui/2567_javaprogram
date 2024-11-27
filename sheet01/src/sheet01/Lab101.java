package sheet01;
import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit : ");
		float productunit = input.nextFloat();
		
		System.out.print("Input price per unit : ");
		float priceperunit = input.nextFloat();
		
		float totalPriceProduct = productunit * priceperunit;
		
		System.out.println("----------------------------------------");
		
		String frmtotalPriceProduct = String.format("%,.2f",totalPriceProduct);
		System.out.println("Total price is "+frmtotalPriceProduct+" baht.");
		
		System.out.println("----------------------------------------");
		
		System.out.print("How many discount (%) : ");
		float discountinput = input.nextFloat();
		
		float discount = totalPriceProduct*(discountinput/100);
		String frmdiscount = String.format("%,.2f",discount);
		
		System.out.println("----------------------------------------");
		float amout = totalPriceProduct-discount; 
		String frmamout = String.format("%,.2f",amout);
		System.out.print("Discount from "+discountinput+"%		"+frmdiscount+" baht."
						+"\nAmout to be paid 		"+frmamout+" baht.");
		

	}

}
