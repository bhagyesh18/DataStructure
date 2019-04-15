/*
 * HomeWork 4 : Java RMI Programming (Using Java on Windows or Linux)
   Class : CS6580 Distributed Systems Assignments
   Group: Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592
   
   Code/test/demo client and server programs on bank ATM application using TCP sockets.
   The following are the opeartions to be supported in menu form:
   deposit  n  d     	deposit d dollars into account  n (input n and d together)
   withdraw n  d		withdraw d dollars from account n (input n and d together)
   balance  n		    get the balance of account      n
   exit			        program exit
   Program exit only through "exit" in the menu.
   No error checking is required (for simplicity)
   
   Description & Steps of RMI programming on server side:
   > To use RMI Programming for client-server Communication, Create files such 
     as Interface, Interface Implementation, Server file and security.policy
   > Firstly, Create the Interface file and define all the methods which will be used
     in the client and server communication. In RMI, Interface plays main role in 
     the middleware because Server return the interface object to client. And Client 
     directly deal with the Interface's methods only.
   > Secondly, Create the implementation of the Interface, which actually overide all 
     methods defined in the interface. Overide methods and write the code for action
     for the methods. Server will use this implementation of the interface and return the
     interface Object to client so client can directly access the methods of implementation.
   > Thirdly, Create the Server class file and register the registry for the interface.
     Create the Implementation java file object which will return the interface object and 
     use the interface object for rebind the object on the server to make it available
     for client. While register registry LocateRegistry.createRegistry(1093), Assign port
     and host for the rmi also. Naming.rebind will make particular service on specified 
     port running. In our case it is "ATM",          
   > Create new file from project and give name security.policy which is used to give 
     permission to server to run specified in the operating system
     Create security.policy and save with following permission:
     grant {
     	permission java.security.AllPermission;
	 }; 
   
    Instruction / How To Run :
    > Compile interface File Ex. javac IBankAtm.java
    > Compile interface Implementation and Server file 
         Ex. javac Server.java   
    > Compile Entity and Client side file
         Ex. javac ClientATM.java 
    > Register the implementation Ex. rmic Server
    > Start the Registery Ex. rmiregistry&
    > Start the Server using java Ex. java Server(class file)  
    
    NOTE : Temporary Bank information are already stored in the Server.java. Server port will assigned 
           on time of creating registry.
    Three Users :
    Account   Password  Amount
    123456    Hello     600.0
    7891011   Yello     3000.0
    121314    Hello123  10000.0
 */
package RMI;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements IBankAtm {

	static ArrayList<BankData> bankDataList;
	
	
	protected Server() throws RemoteException {
		super();
	
	}

	/**
     * Add Temporary Data using Model BankData
     * @return BankDataList of type Arraylist<BankData>
    */
	public static ArrayList<BankData> addData(){
  		ArrayList<BankData> bankDataList=new ArrayList<BankData>();
			BankData bankData=new BankData(123456,"Hello",600.0);
			bankDataList.add(bankData);
			bankData= new BankData(7891011,"Yello",3000.0);
			bankDataList.add(bankData);
			bankData =new BankData(121314,"Hello123",10000.0);
			bankDataList.add(bankData);
	 	    return bankDataList;
	  }
	
	
	public static void main(String[] args) {
		 try
	        {
	            bankDataList=addData();
	            // Register the registry at specified port and host.
	            java.rmi.registry.Registry registry = LocateRegistry.createRegistry(1099);
				
	            // Create Interface using object of implementation class of interface
	            IBankAtm iBankAtm = new Server();
	            
	            // Rebind the Interface on the server and make it available for client
	            // define the Service name through which user can request for interface   
	            Naming.rebind("ATM", iBankAtm);
	            
	            // Once server is ready for accepting request. print following message 
	            System.out.println("Bank ATM Server is Ready to Access");
	            
	        }
	        catch (Exception ex)
	        {
	            System.out.println("There is Problem in the Conneciton");
	        }
	}

	 /**
     * Authenticate the user credentials and return boolean values 
     * @param accountNumber 
     * @param password
     * @return boolean
     */
	public static boolean check(int accountNumber,String password){
    	boolean flag=false;
    	for(int i=0;i<bankDataList.size();i++){
    		BankData bankd=new BankData();
    		if(bankDataList.get(i).getAccountNumber()==accountNumber){
    			bankd=bankDataList.get(i);
    			if(bankd.password.equals((password)))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
	 /**
     * get the bank data from bankDatalist for requested account number 
  	 * @param accountNumber 
     * @param amount
     * @return BankData
     */
    public static BankData getBankData(int accountNumber,double amount){
    	BankData bankData=new BankData();
    	for(int i=0;i<bankDataList.size();i++){
			if(bankDataList.get(i).getAccountNumber()==accountNumber){
				bankData=bankDataList.get(i);
			}
		}
    	return bankData;
    }
    
    /**
     * update the database of BankData 
     * @param accountnumber
     * @param BankData
     * @return void
     */
    public static void updateData(int accountNumber,BankData bd){
    	for(int i=0;i<bankDataList.size();i++){
			if(bankDataList.get(i).getAccountNumber()==accountNumber){
				bankDataList.get(i).setTotalBalance(bd.getTotalBalance());
			}
    	}
    }
	
    
    
    /**
     * validates the account number and password, and returns the boolean values 
     * @param accountnumber
     * @param password
     * @return boolean
     */
	@Override
	public boolean validate(int accountNumber, String password) throws RemoteException {
		boolean status=check(accountNumber, password);
		return status;
	}

	 /**
     * deposit the requested amount into specified account number and return the ackwonledgement Message
     * @param accountnumber
     * @param amount
     * @return String
     */
	@Override
	public String deposit(int accountNumber, double amount) throws RemoteException {
		double balance=0;
		BankData bd=getBankData(accountNumber,amount);
		balance=bd.getTotalBalance();
		balance=balance+amount;
		bd.setTotalBalance(balance);
		updateData(accountNumber,bd);	
		return "Amount has been Deposited Succcesfully \nUpdated Balance of Account "+ accountNumber+" is : $"+balance;
	}

	 /**
     * withdraw the requested amount from specified account number and return the ackwonledgement Message
     * @param accountnumber
     * @param amount
     * @return String
     */
	@Override
	public String withdraw(int accountNumber, double amount) throws RemoteException {
		double balance=0;
		BankData bd=getBankData(accountNumber,amount);
		balance=bd.getTotalBalance();
		balance=balance-amount;
		bd.setTotalBalance(balance);
		updateData(accountNumber,bd);	
		return "Amount has been Deposited Succcesfully \nUpdated Balance of Account "+ accountNumber +" is : $"+balance;
	}

	/**
     * return the account summary of specified account number with Total Balance available 
     * @param accountnumber
     * @return String
     */
	@Override
	public String summary(int accountNumber) throws RemoteException {
		double balance=0;
		BankData bankda=getBankData(accountNumber,0.0);
		balance=bankda.getTotalBalance();
		return "ACCOUNT SUMMARY\nAccount Number : "+ accountNumber +"  Balance : $"+balance ;
	}

}
