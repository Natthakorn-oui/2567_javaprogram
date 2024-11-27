package sheet01;
import java.util.*;
import java.text.*;

public class JavaExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input product price : ");
		float  productPrice = input.nextFloat();
		
		System.out.println();
		
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPriceProduct)+" baht.");
		
		float totalwithvat = totalPriceProduct*1.07f;
		System.out.println("Add VAt 7% is "+frm.format(totalwithvat)+" baht.");
		
		System.out.println();
		
		String frmtotalwithvat = String.format("%,.2f",totalwithvat);
		System.out.println("Output using String.format");
		System.out.println("Add VAt 7% is "+frmtotalwithvat+" baht.");
		
		System.out.println("Output using printf");
		System.out.printf("Add VAt 7% is ", totalwithvat);
		
		input.close();

	}

}
