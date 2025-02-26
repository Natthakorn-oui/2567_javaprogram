
public class ATMData {
	private String accountNumber ;
	private String password ;
	
	ATMData(String accountNumber, String password){
		this.accountNumber = accountNumber;
		this.password = password;
	}
	public String getId() {
		return accountNumber;
	}
	public String getPass() {
		return password;
	}
}
