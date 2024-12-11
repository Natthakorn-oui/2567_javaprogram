import javax.swing.*;

public class Lab203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your Weight in Kg :"));
		double hight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your Hight in Cm :"))/100;
		
		double BMI = weight / (hight * hight);
		
		if (BMI < 18.5)  {
			JOptionPane.showConfirmDialog(null, "BMI = " + String.format("%,.2f", BMI) + "\nYou're Underwight", "BMI",
											JOptionPane.WARNING_MESSAGE);
		}
		else if (BMI < 24.9) {
			JOptionPane.showConfirmDialog(null, "BMI = " + String.format("%,.2f", BMI) + "\nYou're Normal-wight", "BMI",
											JOptionPane.WARNING_MESSAGE);
		}
		else if (BMI < 29.9) {
			JOptionPane.showConfirmDialog(null, "BMI = " + String.format("%,.2f", BMI) + "\nYou're Overwight", "BMI",
											JOptionPane.WARNING_MESSAGE);
		}
		else if (BMI > 30.0) {
			JOptionPane.showConfirmDialog(null, "BMI = " + String.format("%,.2f", BMI) + "\nYou're Obesity", "BMI",
											JOptionPane.WARNING_MESSAGE);
		}
	}

}
