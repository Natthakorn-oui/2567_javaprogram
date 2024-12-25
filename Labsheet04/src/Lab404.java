import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeVaild;

		while (true) {
			// Input student ID
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();

			System.out.print("Enter student code (7 digits): ");
			subjectCode = scanner.nextLine();

			isStudentIDValid = isLength(studentID, 10);
			isSubjectCodeVaild = isLength(subjectCode, 7);

			if (isStudentIDValid && isSubjectCodeVaild) {

				boolean isITStudent = isITStudent(studentID);
				boolean isITSuject = isITSuject(subjectCode);

				
				displayData(isITStudent, isITSuject , studentID);
				break;
			}

		}
	}

	public static boolean isLength(String input, int leg) {

		return input.length() == leg;
	}

	public static boolean isITStudent(String id) {

		if (id.startsWith("21") && id.charAt(2) == '1' && id.substring(3, 6).equals("311")) {
			return true;

		}

		return false;

	}

	public static boolean isITSuject(String Code) {

		if (Code.startsWith("21") && Code.charAt(4) == '1') {
			return true;
		}

		return false;
	}

	public static void displayData(boolean isITStudent, boolean isITSuject , String studentID ) {
		
		System.out.println();
		
		System.out.print("Student id: " + studentID + " ");
		

		if (!isITStudent) System.out.print("is not ");
        System.out.println("1st year student in IT");

        if (!isITSuject) System.out.print("not ");
        System.out.println("enroll in courses for Year 1");
	}
}
