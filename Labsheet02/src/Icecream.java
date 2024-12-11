import javax.swing.*;

public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int vanilla = 10;
		final int chocolate = 15;
		final int topping =5;
		int flavor = 0;
		int price = 0;
		
		flavor =Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B." +
									"\n[2] Chocolate Flavor 15 B." +
									"\nPess number to choose flavor"));
		
		while(flavor < 1 || flavor > 2) {
			JOptionPane.showMessageDialog(null, "ERRRO: Wrong choice!" + "Try again...", "ERROR",
											JOptionPane.ERROR_MESSAGE);
			
			flavor =Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Vannilla Flavor 10 B." +
										"\n[2] Chocolate Flavor 15 B." +
										"\nPess number to choose flavor"));
		}
		
		int addTopping = JOptionPane.showConfirmDialog(null,"Do you want topping?", "Topping",
														JOptionPane.YES_NO_OPTION);
		
		
		if (flavor == 1) {
			price = vanilla;
		}
		else if (flavor == 2){
			price = chocolate;
		}
		
		
		if (addTopping == JOptionPane.YES_OPTION) {
			price += topping;
		}
		else if (addTopping == JOptionPane.NO_OPTION) {
			price += 0;
		}
		
		JOptionPane.showMessageDialog(null, "You choose " + (flavor == 1? "vanilla" : "chocolate") + " flavor" +
										"\nAnd " + (addTopping == JOptionPane.YES_OPTION ? "with" : "no") + " topping" +
										"Total price = " +
										price + " Baht.");
	}

}
