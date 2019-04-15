package Thread;

import java.lang.management.*;
public class DeadLockSituation {
	   public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) throws InterruptedException {
	      ThreadDemo1 T1 = new ThreadDemo1();
	      ThreadDemo2 T2 = new ThreadDemo2();
	      T1.start();
	      T2.start();
	      
	      Thread.sleep(5000);
	        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
	        long ids[] = bean.findMonitorDeadlockedThreads();
	 
	        if(ids != null)
	        {
	            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
	 
	            for (ThreadInfo threadInfo1 : threadInfo)
	            {
	                System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
	 
	                System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread
	 
	                System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.
	 
	                System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
	 
	                System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
	            }
	        }
	        else
	        {
	            System.out.println("No Deadlocked Threads");
	        }
	      
	   }
	 
	   
	   // Deadlock Solution: Solution is only that we can change the order of the locks, 
	   // This is sample program in real case situation can be different.
	   /*
	    * 
	    * 
	    *  private static class ThreadDemo1 extends Thread {
      public void run() {
         synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            
            try {
               Thread.sleep(10);
            } catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for lock 2...");
            
            synchronized (Lock2) {
               System.out.println("Thread 1: Holding lock 1 & 2...");
            }
         }
      }
   }
   private static class ThreadDemo2 extends Thread {
      public void run() {
         synchronized (Lock1) {
            System.out.println("Thread 2: Holding lock 1...");
           
            try {
               Thread.sleep(10);
            } catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 2...");
            
            synchronized (Lock2) {
               System.out.println("Thread 2: Holding lock 1 & 2...");
            }
         }
      }
   } 
	    * 
	    */
	   
	   private static class ThreadDemo1 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }
	   private static class ThreadDemo2 extends Thread {
	      public void run() {
	         synchronized (Lock2) {
	            System.out.println("Thread 2: Holding lock 2...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 1...");
	            
	            synchronized (Lock1) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   } 
	}