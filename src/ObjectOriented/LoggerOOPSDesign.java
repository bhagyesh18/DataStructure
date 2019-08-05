package ObjectOriented;

enum LogTarget
{
    File, Database, EventLog
}

abstract class LogBase
{
	protected Object lockObj = new Object();
    public abstract void Log(String message);
}

class FileLogger extends LogBase
 {
    public String filePath = "D:\\IDGLog.txt";
    public  void Log(String message)
    {
     	synchronized (lockObj) {
   		 //Code to log data to the database
		}
         
    }
}

class DBLogger extends LogBase
{
    String connectionString = "";
    public  void Log(String message)
    {
    	synchronized (lockObj) {
    		 //Code to log data to the database
		}
       
    }
}

class EventLogger extends LogBase
{
    public void Log(String message)
    {
     	synchronized (lockObj) {
		 //Code to log data to the database
	}
  
    }
}                                

class LogHelper
{
    private static LogBase logger = null;
    public static void Log(LogTarget target, String message)
    {
        switch(target)
        {
            case File:
                logger = new FileLogger();
                logger.Log(message);
                break;
            case Database:
                logger = new DBLogger();
                logger.Log(message);
                break;
            case EventLog:
                logger = new EventLogger();
                logger.Log(message);
                break;
            default:
                return;
        }
    }
}


public class LoggerOOPSDesign {
	
	public static void main(String[] args) {
		
		 LogHelper.Log(LogTarget.File, "Hello");
		 
		 
	}

}
