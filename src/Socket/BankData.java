package Socket;
/*
 * HomeWork 2 :  Network TCP Socket programming 
 * Class : CS6580 Distributed Systems Assignments
 * Group:  Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592 
 *
 * Model Of BankData
 * This Entity is used to store the bank information such as Account number,Password, Balance.  
 */

class BankData {
	String accountNumber;
	String SavingNumber;
	String password;
	int totalBalance;

	public BankData() {

	}

	public BankData(String accountNumber, String password, int totalBalance) {
		super();
		this.accountNumber = accountNumber;
		this.password = password;
		this.totalBalance = totalBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSavingNumber() {
		return SavingNumber;
	}

	public void setSavingNumber(String savingNumber) {
		SavingNumber = savingNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(int totalBalance) {
		this.totalBalance = totalBalance;
	}

}