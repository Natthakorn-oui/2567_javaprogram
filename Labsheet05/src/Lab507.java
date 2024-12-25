import javax.swing.JOptionPane;

public class Lab507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		
		for(int i = 0;i < num.length;i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+ ":"));
		}
		showEven(num);
		showOdd(num);
	}
	public static void showEven(int[] num) {
		String even = "List of even number \n ";
		for(int i = 0;i < num.length;i++) {
			if(num[i]%2 == 0) {
				even += num[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, even);
	}
	public static void showOdd(int[] num) {
		String odd = "List of odd number \n ";
		for(int i = 0;i < num.length;i++) {
			if(num[i]%2 != 0) {
				odd += num[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, odd);
	}
}
