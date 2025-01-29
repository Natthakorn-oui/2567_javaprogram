import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Product[] productList = new Product[4];
		
		for(int i=0; i<productList.length;i++) {
			System.out.print("Input product Id : ");
			productList[i].setId(sc.nextLine());
				
			System.out.print("Input product unit : ");
			productList[i].setUnit(sc.nextInt());
				
			System.out.print("Input product price : ");
			productList[i].setPrice(sc.nextDouble());
			System.out.println();
			
			line();
			sc.close();
		}
		double totalPrice = 0;
        for (Product _productList:productList) {
            System.out.println("Product ID : " + _productList.getId() + ", Total price = " + 
            		String.format("%,.2f", _productList.calculate()) + " baht.");
            
            totalPrice += _productList.calculate();
        }
        System.out.println("Total price of all products = " + String.format("%,.2f", totalPrice));
		
	}
	public static void line() {
		for(int i=1;i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
