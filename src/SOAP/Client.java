package SOAP;

/*
HomeWork 6 : SOAP Programming: (using Java on Windows or Linux ) - Due (2/11/2016)
Class : CS6580 Distributed Systems Assignments
Group: Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592

Client class that calls the web service using the WSDL file.

#  Description & Steps of RMI programming on server side:
   > To Use SOAP web Service Invoke the WSDL file of SOAP Service. You must know the URL of
     SOAP WSDL file and Web Service name.
  > Use URL Object of java.net to request the wsdl file to soap web service.
     For Ex.  URL url = new URL("http://localhost:8080/WebServices/Assignment6?WSDL");
  > Once Wsdl file is requested next step to request web service using specified 
     web service name and web service host.
     For Ex.  QName qname = new QName("http://server.assignment6/", "ATMServiceService");
  > Use Service Object of xml to parse the web service request and Wsdl file from
    SOAP Envelope (SOAP message in the xml)   
     For Ex.  Service service = Service.create(url, qname);
  > Use service object to get port and Object Reference. Use get port method to request
    remote interface as Object reference
     For Ex.  IATMService atmService = service.getPort(IATMService.class);
 
   
#  Instruction / How To Run :
   > Compile javac Client.java
   > Start the Server before executing client
      java Client
      
#  How Client finds the Server:	
   When SOAP web service is published, it generates the server stub. Client can communicate to the
   Server using WSDL file of SOAP Protocol. Client Contacts to wsdl file of SOAP web service. and 
   use the web service name. Client request through Host, Port, Web service name and Wsdl file.
   Here Wsdl file work as client stub to communicate with server. Client use the URI, Qname, and 
   Service object to request the remote object reference. Service object also cast the remote 
   Object reference to remote interface. 
   
   NOTE : Temporary Bank information are already stored in the Server.java. Server port can be assigned 
           on time of creating registry or starting the server. 

*/
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8080/WebServices/Assignment6?WSDL");

        QName qname = new QName("http://server.assignment6/", "ATMServiceService");

        Service service = Service.create(url, qname);

        IATMService atmService = service.getPort(IATMService.class);

        int option = 0;
        String input = "";
        String password = "";
        double amount = 0;
        int accountNumber = -0;

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        do {

            System.out.println("\n------------------------");
            System.out.println("Hello! Welcome to Bank of the future!");
            System.out.println("How may we help you today?");
            System.out.println("1- Make a deposit");
            System.out.println("2- Do a withdrawal");
            System.out.println("3- View account summary");
            System.out.println("4- Exit");
            System.out.println("------------------------");
            System.out.print(" I'd like to: ");

            option = scanInt.nextInt();

            switch (option) {
                case 1:
                    // Deposit operation 
                    System.out.print(" Enter Account Number & Amount$: ");
                    input = scanStr.nextLine();
                    String[] data = input.split(" ");
                    accountNumber = Integer.parseInt(data[0]);
                    amount = Double.parseDouble(data[1]);

                    System.out.print(" Enter Password: ");
                    password = scanStr.nextLine();

                    //if valid user, save password for future requests.
                    if (!atmService.authenticate(accountNumber, password)) {
                        System.out.println("\nError: Invalid account credentials.");
                        break;
                    } else if (atmService.deposit(accountNumber, amount)) {
                        System.out.println("\nDeposit was successful.");
                        System.out.println(atmService.summary(accountNumber));
                    }
                    break;

                case 2:	 // Withdraw operation 
                    System.out.print(" Enter Account Number & Amount$: ");
                    input = scanStr.nextLine();
                    String[] data1 = input.split(" ");
                    accountNumber = Integer.parseInt(data1[0]);
                    amount = Double.parseDouble(data1[1]);
                    System.out.print(" Enter Password: ");
                    password = scanStr.nextLine();

                    if (!atmService.authenticate(accountNumber, password)) {
                        System.out.println("\nError: Invalid account credentials.");
                        break;
                    } else if (atmService.withdraw(accountNumber, amount)) {
                        System.out.println("\nWithdrawl was successful.");
                        System.out.println(atmService.summary(accountNumber));
                    }

                    break;

                case 3:
                    // Account Summary operation 
                    System.out.print(" Enter Account Number: ");
                    accountNumber = scanInt.nextInt();
                    System.out.print(" Enter Password: ");
                    password = scanStr.nextLine();

                    if (!atmService.authenticate(accountNumber, password)) {
                        System.out.println("\nError:Invalid account credentials.");
                        break;
                    } else {
                        System.out.println("\nHere is your account summary:");
                        System.out.println(atmService.summary(accountNumber));
                    }
                    break;

                case 4:// Program Exit 
                    System.out.println("...thank you for using Bank of the future!");
                    System.exit(0);
                    break;
            }

        } while (option < 4);

    }

}
