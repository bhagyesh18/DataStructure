/*
 * HomeWork 5 : RMI-IIOP Programming: (using Java on Windows or Linux ) - Due (2/4/2016)
   Class : CS6580 Distributed Systems Assignments
   Group: Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592
   
#  Description & Steps of RMI programming on server side:
   > To use RMI Programming for client-server Communication, Create files such as Interface,
     Interface Implementation, Server file(objedt Server), Client file (Object Client)
   > For Client Side, create Client java file(object Client).
   > Server registry is running on specific port which is defined by the ORDB.
   > To connect to the server gather Host name and port
   > In Client side software, create Object of Context inteface using initialContext Object. Instead of
     normal RMI Naming Class use the context Object to get registry. Using context Object look for the
     server host and end-point. Once you get the endpoint, lookup will return the Object reference. 
     Now Cast the object reference into RMI interface using PortableRemoteObject.narrow (Narrow type Casting)
     and assign RMI interface class in which you want to cast the object.        
            Context initialNamingContext = new InitialContext();
            Object serviceRef = initialNamingContext.lookup("ATM");
            IBankAtm iBankAtm = (IBankAtm) PortableRemoteObject.narrow(serviceRef, IBankAtm.class);
   > Using casted RMI Interface, invoke any methods specified in the interface because those
     method are already implemented somewhere at server side (In Object Server or Implementation class). 
   > invoke any methods using returned interface and get return values of the methods.  
 
   
#  Instruction / How To Run :
   > Compile javac ClientATM.java
   > Start Client / Run the Client 
      java -classpath . -Djava.naming.factory.initial=com.sun.jndi.cosnaming.CNCtxFactory -Djava.naming.provider.url=iiop://localhost:1050 ClientATM
    
   
#  How Client finds the Server:
   When Register the Implementation class, rmic generates the Client stub and server tie classes.
   Client stub is proxy for remote object.Using client stub , client stub send calls to server.
   For each RMI interface there is implementation of interface, client stub locate the JNDI directory
   and for server host and end point (port). Server return the remote object reference and cast the 
   Object class using narrow casting into RMI interface. Use RMI Interface Object cast  and using
   this interface object, Client can call any methods of interface which is actually hosted at server. 
   
   NOTE : Temporary Bank information are already stored in the Server.java. Server port can be assigned 
           on time of creating registry or starting the server. 
   
 */
package RMIIIOP;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class ClientATM {

	public static void main(String[] args) {
		
		int option=0;
	    Scanner scan=new Scanner(System.in);
	    Scanner scanCredentials=new Scanner(System.in);
		String password,result;
		int accountNumber;
		double amount;
		boolean loginStatus,exit=false;
		String message,input;
		
		try
        {

		    // Context Object will get registry for service form specific port and host   
            Context initialNamingContext = new InitialContext();
            
            // Using context object look for the endpoint and service 
            // loopup will return the object class because there can be different type of
            // interface returned from one service
            Object serviceRef = initialNamingContext.lookup("ATM");
            
            // Cast Object Reference into RMI Interface 
            IBankAtm iBankAtm = (IBankAtm) PortableRemoteObject.narrow(serviceRef, IBankAtm.class);
            
            
             do{

    	     System.out.println("------------------------");	 
             System.out.println("ATM MACHINE");
	       	 System.out.println("MENU");
	       	 System.out.println("1- Deposit");
	       	 System.out.println("2- Withdraw");
	       	 System.out.println("3- Account Summary");
	       	 System.out.println("4- Exit");
	       	 System.out.println("------------------------");
	       	 System.out.print(">Enter Your Option ::");
	       	 option=scan.nextInt();
	       	 
	       	 switch(option)
	       	 {
	       	 case 1:	
	       		     // Deposit operation 
		       		 System.out.print(">Enter Account Number & Amount$ : ");
					 input=scanCredentials.nextLine();
					 String[] data=input.split(" ");
					 accountNumber=Integer.parseInt(data[0]);
					 amount=Double.parseDouble(data[1]);
					 
					 System.out.print(">Enter Password :: ");
					 password=scanCredentials.nextLine();
					 
					 loginStatus=iBankAtm.validate(accountNumber, password);
					 if(loginStatus){
						message= iBankAtm.deposit(accountNumber, amount);
					 }else{
						 message="Wrong Credentials";
					 }
					 System.out.println(message);
					 break;
					 
	       	 case 2:	 // Withdraw operation 
			       		 System.out.print(">Enter Account Number & Amount$ : ");
						 input=scanCredentials.nextLine();
						 String[] data1=input.split(" ");
						 accountNumber=Integer.parseInt(data1[0]);
						 amount=Double.parseDouble(data1[1]);
						 System.out.print(">Enter Password :: ");
						 password=scanCredentials.nextLine();
						 loginStatus=iBankAtm.validate(accountNumber, password);
						 
						 if(loginStatus){
							message= iBankAtm.withdraw(accountNumber, amount);
						 }else{
							 message="Wrong Credentials";
						 }
						 System.out.println(message);
						 break;
	       		 
			case 3: 
				    // Account Summary operation 
					System.out.print(">Enter Account Number :: ");
					accountNumber = scan.nextInt();
					System.out.print(">Enter Password :: ");
					password = scanCredentials.nextLine();
					loginStatus = iBankAtm.validate(accountNumber, password);
	
					if (loginStatus) {
						message = iBankAtm.summary(accountNumber);
					} else {
						message = "Wrong Credentials";
					}
					System.out.println(message);
					break;
	       		 	
	       	 case 4:// Program Exit 
	       		    System.out.println("Program Exited");
	       	        System.exit(0);
	       		    break;
	       	 }
	       	 
          }while(option<4);   
        
        }
		catch(Exception e){
			
		}
	}

}
