/*
 * HomeWork 5 : RMI-IIOP Programming: (using Java on Windows or Linux ) - Due (2/4/2016)
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
   
      
#   WHY Java RMI-IIOP : 
    RMI over IIOP, Allow to create CORBA application using RMI components 
   
#   Description & Steps of RMI-IIOP Programming on server side:
   > To use Java-RMI IIOP Programming for client-server Communication, Create files
     such as RMI Interface, Interface Implementation  (RMI Implementation, can be 
     Object Server file), Server file (Object Server)
   > Firstly, Create the RMI Interface file and define all the methods which will 
     be used in the client and server communication. In RMI, Interface plays main
     role in the middleware because Server return the RMI interface object to client.
     And Client  directly deal with the RMI Interface's methods only and invoke the 
     methods form client side. 
   > Secondly, Create the  implementation  class of  the Interface(Object Server can be
     Implementation  class of RMI interface), which actually overide all methods defined
     in the interface. Overide methods and write the code for action for the  methods.
     Server will use this implementation of the interface and return the RMI interface
     Object as Object Reference to client so client can cast the Object reference into
     RMI interface and directly access the methods of implementation using RMI interface
     object.
   > Thirdly, Create the Server Object file(Object Server can be Implementation class 
     of RMI interface).
     Create object of Implementation class which will return the RMI interface object and
     use the interface object for rebind the object on the server to make it available for
     client. In Java RMI-iiop,  It makes available to invoke operation on remote services
     using iiop and RMI interface. if Implementation in other platform (in C++) use the 
     rmic -idl to generate the IDL file using RMI interface file.usign idl file we can 
     generate the stub and tie file for comman interfac  in java and c++.
     
     Create Object of context using intialContext Class and Register the service for RMI
     and use the rebind method of contect object and define the RMI type, Host, port,Service
     Name.
     Ex.
        Context initialNamingContext = new InitialContext();
	    initialNamingContext.rebind("ATM", iBankAtm);
	 Register the implementation class in iiop to use CORBA utility using following command 
     rmic -iiop Server
     which will genrate Client stub and Server tie file
   > Use orbd foe naming service to server process and Define the port and host for naming the server process.
      orbd -ORBInitialPort 1050 -ORBInitialHost localhost&
   > Run the Server 
     java -classpath . -Djava.naming.factory.initial=com.sun.jndi.cosnaming.CNCtxFactory -Djava.naming.provider.url=iiop://localhost:1050 Server &
   
   
   
 #  Instruction / How To Run :
    > Compile interface File  
       javac IBankAtm.java
    > Compile interface Implementation file (Object Server) and Server file 
       javac Server.java   
    > Compile Entity and Client side file
       javac ClientATM.java 
    > Register the implementation Class in IIOP
       rmic -iiop Server  (Will generate _iBankAtm_Stub.class and _IBankAtm_Tie.class) 
    > Start ORBD and register the RMI in CORBA for naming the server. Define port and host.
       orbd -ORBInitialPort 1050 -ORBInitialHost localhost&
    > Start Server / Run the Server 
       java -classpath . -Djava.naming.factory.initial=com.sun.jndi.cosnaming.CNCtxFactory -Djava.naming.provider.url=iiop://localhost:1050 Server &
    
#   NOTE : Temporary Bank information are already stored in the Server.java. Server port can be assigned 
           on time of creating registry or starting the server.  
           
 */
package RMIIIOP;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class Server extends PortableRemoteObject implements IBankAtm {

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
	            IBankAtm iBankAtm = new Server();
	            
	            // Rebind the Interface on the server and make it available for client
	            // Context Object will register the service on specific port and host   
	            Context initialNamingContext = new InitialContext();
	            // using context object rebind the implementation Class on the server.
	            initialNamingContext.rebind("ATM", iBankAtm);
	            
	            // Once server is ready for accepting request. print following message 
	            System.out.println("Bank ATM Server is Ready to Access");
	            
	        }
	        catch (Exception ex)
	        {
	            System.out.println("There is Problem in the Conneciton :"+ex.getMessage() );
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
		return "Amount has been Withdraw Succcesfully \nUpdated Balance of Account "+ accountNumber +" is : $"+balance;
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
