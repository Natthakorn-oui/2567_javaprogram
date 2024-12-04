package sheet01;
import javax.swing.*;

public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application", "Message", JOptionPane.INFORMATION_MESSAGE);
	    String name = JOptionPane.showInputDialog(null, "Enter employee name", "Input", JOptionPane.QUESTION_MESSAGE);
	    String hourInput = JOptionPane.showInputDialog(null, "Enter total hours for this employee", "Input", JOptionPane.QUESTION_MESSAGE);
	    
	    double hourEmp = Double.parseDouble(hourInput);
	    double hourlyWage = 7.5;
	    double grossEarnings = hourEmp * hourlyWage;
	    double taxRate = 0.15;
	    double taxAmount = grossEarnings * taxRate;
	    double netEarnings = grossEarnings - taxAmount;
	    
	   String message = "Employee name:"+ name + "\nHours worked:" + hourEmp + "\nHourly wage:$" + hourlyWage +
			   			"\nGross earning:$" + grossEarnings + "\nTax rate:" + taxRate + "\nTax:$" + taxAmount +
			   			"\nNet earning:$"+ netEarnings;
	   
	   JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
