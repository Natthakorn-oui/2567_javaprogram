import javax.swing.*;

public class Lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputMail = JOptionPane.showInputDialog("input your e-mail:").toLowerCase();
		boolean chkEmail = false;
		
		while(inputMail.startsWith("@") || inputMail.contains(" ")) {
			inputMail = JOptionPane.showInputDialog("input your e-mail, again:".toLowerCase());
		}
		
		chkEmail = inputMail.endsWith("@gmail.com") || inputMail.endsWith("@hotmail.com");
		
		if(chkEmail) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + inputMail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}

	}
}
