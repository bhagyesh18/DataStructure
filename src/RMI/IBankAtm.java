/*
 * HomeWork 4 : Java RMI Programming (Using Java on Windows or Linux)
   Class : CS6580 Distributed Systems Assignments
   Group: Bhagyesh Patel zi2736 & Yonas Kidanemariam MX8592
 
   Remote Interface
   Interface to generate the stub for the client's communication 
   Define definition of methods to be used in the RMI 
   Override the following methods into another class and implement the IBankAtm Interface 
   Both client and server interacts with the remote interface
   
 */
package RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *  @author Bhagyesh and Yonas
 *  Interface to generate the stub for the client's communication.
 *  Define method definition only & variables which can be used RMI to communicate between
 *  client and server   
 */
public interface IBankAtm extends Remote {
	    public boolean validate (int accountNumber, String password) throws RemoteException;
	    public String deposit (int accountNumber, double amount) throws RemoteException;
	    public String withdraw (int accountNumber, double amount) throws RemoteException;
	    public String summary (int accountNumber) throws RemoteException;
	}

