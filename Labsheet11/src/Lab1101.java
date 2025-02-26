import java.util.*;
import java.io.*;

public class Lab1101 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Input Section : ");
		int section = sc.nextInt();
		
		printHeader(section);
		showListStudent(section);
		
	}
	public static void printHeader (int sec) {
		System.out.println("************************************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("************************************************************");
	}
	public static void showListStudent (int sec) throws IOException{
		try(BufferedReader readFlie = new BufferedReader(new FileReader("src//txtFile//List107.txt"))){
			
			String temp = "";	
			while( (temp = readFlie.readLine()) != null ) {
				String[] data = temp.split("\t");
				
				if(data.length < 6 ) continue;
				int studentSection = Integer.parseInt(data[3]);
				
				if(studentSection == sec) {
					double midScore = Double.parseDouble(data[4]);
					double finalScore = Double.parseDouble(data[5]);
					System.out.printf("%s %s \t%.2f \t%.2f \t%s%n", data[0], data[2], midScore, finalScore, 
										findResult(midScore, finalScore));
				}
			}			
		}
		
	}
	public static String findResult(double mid, double fin){
		return(mid + fin) <= 40? "Fail" : "Pass";
	}

}
