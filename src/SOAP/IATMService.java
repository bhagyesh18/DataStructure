package SOAP;

/*
 HomeWork 6 : SOAP Programming: (using Java on Windows or Linux ) - Due (2/11/2016)
 Class : CS6580 Distributed Systems Assignments
 Group: Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592

# Description and Run Instruction :   
   Interface to provide list of methods to implement for the ATMService.
   We'll also be using this interface on the client side to reference its methods
   Define method definition only & variables which can be used to communicate between
   client and server.
 
# @Webmethod
   Use @WebService  Annotation to define each method of interface 
   as methods of web service. Overide these method into implementation class
   of interface. 
 
# @SOAPBinding(style = Style.RPC)
   This annotation defines the interface as Remote Procedure call using SOAP protocol
   and allow to generate the WSDL file. Client can directly access this interface 
   once connection between server and client established. 
 
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//The @WebSerivice anotation exposes this interface to the webservice clients
@WebService
@SOAPBinding(style = Style.RPC)
public interface IATMService {

    //Methods with @WebMethod anotation will be exposed to the webservice clients
    @WebMethod
    public boolean authenticate(int accountNumber, String password);
    
    //Methods with @WebMethod anotation will be exposed to the webservice clients
    @WebMethod
    public boolean deposit(int accountNumber, double amount);

    //Methods with @WebMethod anotation will be exposed to the webservice clients
    @WebMethod
    public boolean withdraw(int accountNumber, double amount);

    //Methods with @WebMethod anotation will be exposed to the webservice clients
     @WebMethod
    public String summary(int accountNumber);

}
