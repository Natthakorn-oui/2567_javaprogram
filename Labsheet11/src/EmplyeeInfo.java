import java.io.IOException;
import java.util.*;
public class EmplyeeInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String choose;
		System.out.print("Insert or Search Data? : " );
		choose = sc.next().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("search")) {
			System.out.print("Please text insert or search data, again : ");
			choose = sc.next().toLowerCase();
		}
		
		 SaveAndOpen objFile = new SaveAndOpen();
		 if(choose.equals("insert")) {
			 objFile.insert();		 
		}
		 else {
			 System.out.print("\nEnter dept : ");
			 String dept = sc.next();
			 objFile.setDept(dept);
			 objFile.search();
		 }
	}

}
