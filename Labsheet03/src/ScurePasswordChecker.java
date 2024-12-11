import java.util.*;

public class ScurePasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password;
		String errors =  "";
		
		while(true) {
			System.out.println("Enter your password (type 'exit' to quit);");
			password = input.nextLine();
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminate");
				break;
			}
			
			
			if(password.length() < 8) {
				errors += "- Password must be at least 8 character long.\n";
			}
			boolean upper = false;
			boolean lower = false;
			boolean digit = false;
			
			for (int i = 0;i <= password.length()-1;i++) {
				char ch = password.charAt(i);
				
				if(ch >= 'A' && ch <= 'z' ) {
					upper = true;
				}
				else if (ch >= 'a' && ch <= 'z' ) {
					lower = true;
				}
				else if (ch >= 0 && ch <=9) {
					digit = true;
				}
			}
			if(!upper) {
				errors += "- Password must comtrain at lease one uppercase latter (A-Z).\n";
			}
			if(!lower) {
				errors += "- Password must comtrain at lease one lowercase latter (a-z).\n";
			}
			if(!digit) {
				errors += "- Password must comtrain at lease one digit (0-9).\n";
			}
			
			if(errors.isEmpty()) {
				System.out.print("Your password is scure.");
				break;
			}
			else {
				System.out.print("Password valiable errors.");
				System.out.print(errors);
			}
		}	
			
			input.close();
	}

}
