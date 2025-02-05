import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Intput employee id : ");
		String empId = input.nextLine();
		System.out.print("Intput employee name : ");
		String empName = input.nextLine();
		System.out.print("Intput employee salary : ");
		double empSalary = input.nextDouble();
		System.out.print("Intput employee sales : ");
		double empSales = input.nextDouble();
		
		Sales emp1 = new Sales(empId, empName, empSalary,empSales);
		System.out.println(emp1);
		System.out.print("Total salary "+ (emp1.getSalary()+emp1.getCommission())+ "Baht.");
	}

}
