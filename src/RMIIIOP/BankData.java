/*
 * HomeWork 5 : RMI-IIOP Programming: (using Java on Windows or Linux ) - Due (2/4/2016)
   Class : CS6580 Distributed Systems Assignments
   Group: Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592
 
#  Model Of BankData
   This Entity is used to store the bank information such as Account number,Password, Balance.
   and used to store temporary data of Bank.
   This Entity can be used on Client side and server side also.  
 */
package RMIIIOP;
class BankData {
	
	// Entity Variable 
	int accountNumber;
	String SavingNumber;
	String password;
	double totalBalance;

	public BankData() {

	}

	// constructor stores the account number,passoword, total Balance
	public BankData(int accountNumber, String password, double totalBalance) {
		super();
		this.accountNumber = accountNumber;
		this.password = password;
		this.totalBalance = totalBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
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

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

}