package Socket;
/*
   HomeWork 2 :  Network TCP Socket programming 
   Class : CS6580 Distributed Systems Assignments
   Group:  Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592 
 
   Problem :
   Network TCP Socket programming (in C or Java, Linux/Windows) - Due (1/19/2016)
   Code/test/demo client and server programs on bank ATM application using TCP sockets.
   The following are the opeartions to be supported in menu form:
   deposit  n  d     	deposit d dollars into account  n (input n and d together)
   withdraw n  d		withdraw d dollars from account n (input n and d together)
   balance  n		get the balance of account      n
   exit			program exit
   Program exit only through "exit" in the menu.
   No error checking is required (for simplicity)
 */

/*
  > Open Console and Go to Source Directory.
  > Compile Each java files. Ex. javac ClientATM.java
  > First Run the Server File . Ex. java Server
  > Then Run CleintATM File.  Ex. Java ClientATM
  > Follow the Steps in Console.
  
   Program client and server side descriptions: 
   Specific Port is Already given to the server and Server is hosted on LocalHost only.
   Client can connect to the server using the host localhost and port 4045. Here We are using 4045 Port. 
   
   NOTE : Temporary Bank informations are already stored in Server.java using ArrayList of BankData ArrayList<BankData> 
 */


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;


/**
 * @author Bhagyesh $ yonas
 * ClientATM Class is a Client which works as ATM Machine  
 */
public class ClientATM {

	public static void main(String a[])
	{
		  String serverHost = "localhost";
		  
		  // PORT Number 
		  int port=4045,option=0,exit=0;
	      Scanner scan=new Scanner(System.in);
	      Scanner scanCredentials=new Scanner(System.in);
		  String account,password,result;
		 
		  
	      try
	      {
	    	 // Connect to server using Server Host and Port where server is hosted.   
	     	 Socket clientSocket = new Socket(serverHost, port);
	     	 
	     	 // OutputStream to write on server side
	         OutputStream opStreamServer = clientSocket.getOutputStream();
	    	 ObjectOutputStream objOutStream = new ObjectOutputStream(opStreamServer);
		 	 InputStream inputStream = clientSocket.getInputStream();
	         DataInputStream dataIStreamClient = new DataInputStream(inputStream);
	        
	         //Once client gets connection with Server, Meessage will be printed. 
	         System.out.println(dataIStreamClient.readUTF());
	    		    
	         	 do{
	         	 System.out.println("--------------------------------------");	 
	        	 System.out.println("Enter Your Credentials");
	        	 System.out.print(">Enter Account Number :: ");
				 account=scanCredentials.nextLine();
				 System.out.print(">Enter Password :: ");
				 password=scanCredentials.nextLine();
				 ClientRequest clientRequest=new ClientRequest("Validate", account, password, 00);
				 objOutStream.writeObject(clientRequest);
				 result=dataIStreamClient.readUTF();
				 
				 // if account number and password are correct then menu will appear
				 if(result.equals("Correct")){
					 do{
			          		 int amount;
							 System.out.println("------------------------");
				        	 System.out.println("MENU");
				        	 System.out.println("1 :: Deposit");
				        	 System.out.println("2 :: Withdraw");
				        	 System.out.println("3 :: Account Summary");
				        	 System.out.println("4 :: Exit");
				        	 System.out.println("------------------------");
				        	 System.out.print(">Enter Your Option ::");
				        	 option=scan.nextInt();
				        	 System.out.println("------------------------");
				        	
				        	switch (option) {
							case 1:		
										System.out.println("\nDEPOSIT MENU");
										System.out.print(">Enter Amount ::");
										amount=scan.nextInt();
										clientRequest=new ClientRequest("Deposit", account, password, amount);
										// Write an object to server. Sending Request in Object Form
										objOutStream.writeObject(clientRequest);
										// Get Response from server
										System.out.println(dataIStreamClient.readUTF());
										break;
							case 2:		
										System.out.println("\nWITHDRAW MENU");
										System.out.print(">Enter Amount ::");
										amount=scan.nextInt();
										clientRequest=new ClientRequest("Withdraw", account, password, amount);
										// Write an object to server. Sending Request in Object Form
										objOutStream.writeObject(clientRequest);
										// Get Response from server
										System.out.println(dataIStreamClient.readUTF());
										break;
							case 3:    
										System.out.println("\nACCOUNT SUMMARY");
										clientRequest=new ClientRequest("Summary", account, password, 0);
										// Write an object to server. Sending Request in Object Form
										objOutStream.writeObject(clientRequest);
										// Get Response from server
										System.out.println(dataIStreamClient.readUTF());
										break;
							case 4:     clientRequest=new ClientRequest("EXIT", "", "", 0);
										// Write an object to server. Sending Request in Object Form
										objOutStream.writeObject(clientRequest);
										// Get Response from server
										System.out.println(dataIStreamClient.readUTF());
										System.out.println("EXITED");
										break;
							}
				}while(option<4);
			
			}else{
				System.out.println("Wrong Credentials. Enter Account and Password Again");
			}
				 
	        }while(exit==0);
	         	 
	        clientSocket.close();
	        
	        
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	}
	
}
