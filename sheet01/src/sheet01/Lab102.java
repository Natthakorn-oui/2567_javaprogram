package sheet01;
import java.util.*;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");
		
		int minInput = scanner.nextInt();
		int minInyear = 60 * 24 * 365; 
        int years = minInput / minInyear; 
        int remainingMin = minInput % minInyear;
        int days = remainingMin / (60 * 24); 

		System.out.print(minInput + " minutes is approximately " + years + " years and " + days + " days.");

	}

}
