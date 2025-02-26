import java.io.*;
import java.io.PrintStream;
import java.util.*;

public class SaveAndOpen extends Emplyee{
	private String name;
	private String dept ;
	
	public void insert() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtfile//emplyee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name : ");
			name = sc.next();
			System.out.print("Enter department : ");
			dept = sc.next();
			writeFile.println(name + "\t" + dept);
			
			System.out.print("Do you want to input data again : ");
			answer = sc.next();
		}
		while(answer.equalsIgnoreCase("y"));
	}
	
	public void search () throws IOException{
		try{
			Scanner readFile = new Scanner(new File("src//txtfile//emplyee.txt"));
			int i =0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next(); //dept in file emplyee
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+")" + name);
					check = true;
				}
				if(check) {
					super.header();
					System.out.println("Emplyee in dept " + super.getDept() + "is " + i + "person(s).");
				}
				else {
					System.out.println("Sorry, no dept : Frontend in file");
				}
			}
			
		}	
		catch (Exception e) {
			System.out.print("\nSorry, file not found....");
		}
		
	}
}
