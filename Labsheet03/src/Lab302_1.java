import javax.swing.*;

public class Lab302_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputMail ;
		boolean chkEmail = false;
		
		while(true) {
			inputMail = JOptionPane.showInputDialog("input your e-mail, again:".toLowerCase());
			
			while(inputMail.startsWith("@") || inputMail.contains(" ")) {
				inputMail = JOptionPane.showInputDialog("input your e-mail, again:".toLowerCase());
			}
			chkEmail = inputMail.endsWith("@gmail.com") || inputMail.endsWith("@hotmail.com");
			if(chkEmail) {
				chkEmail = inputMail.endsWith("@gmail.com") || inputMail.endsWith("@hotmail.com");
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				continue;
			}
		}

	}

}
