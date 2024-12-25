import javax.swing.*;

public class Lab501_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean validName = false;
		
		String dep = JOptionPane.showInputDialog("Enter a department names");
		
		for(int i = 0 ;i < deptName.length;i++) {
			if(dep.equalsIgnoreCase(deptName[i])) {
				validName = true;
			}
		}
		if(validName) {
			JOptionPane.showMessageDialog(null, dep + " was found in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, dep + " was not found in the list");
		}
	}
}
