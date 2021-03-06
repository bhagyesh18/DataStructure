package Thread;

/*
 * 
 * 
 * When we start two or more threads within a program, there may be a situation when multiple threads try to 
 * access the same resource and finally they can produce unforeseen result due to concurrency issues. For example, 
 * if multiple threads try to write within a same file then they may corrupt the data because one of the threads 
 * can override data or while one thread is opening the same file at the same time another thread might be closing 
 * the same file.

So there is a need to synchronize the action of multiple threads and make sure that only one thread can access the
 resource at a given point in time. This is implemented using a concept called monitors. Each object in Java is associated
  with a monitor, which a thread can lock or unlock. Only one thread at a time may hold a lock on a monitor.

Java programming language provides a very handy way of creating threads and synchronizing their task by using synchronized
 blocks. You keep shared resources within this block. Following is the general form of the synchronized statement −

Syntax
synchronized(objectidentifier) {
   // Access shared variables and other shared resources
}
 */

class PrintDemo {
	public void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}
}

// With Synchrnized Method
//   class ThreadDemo extends Thread {
//	   private Thread t;
//	   private String threadName;
//	   PrintDemo  PD;
//
//	   ThreadDemo( String name,  PrintDemo pd) {
//	      threadName = name;
//	      PD = pd;
//	   }
//	   
//	   public void run() {
//	      PD.printCount();
//	      System.out.println("Thread " +  threadName + " exiting.");
//	   }
//
//	   public void start () {
//	      System.out.println("Starting " +  threadName );
//	      if (t == null) {
//	         t = new Thread (this, threadName);
//	         t.start ();
//	      }
//	   }
//	}

// With Synchronized MEthod 
class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo PD;

	ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

class SynchronizedThread {
	public static void main(String args[]) throws InterruptedException {

		PrintDemo PD = new PrintDemo();

		ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
		ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			// T1.join();
			// T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}

// another demo from java point
//when you make method a synchonized, lock will applied to the object
class NumberPrint {
	synchronized void printmap(int n) {// 
		for (int i = 1; i <= 3; i++) {
			System.out.println(n + i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class SycnDemo {
	public static void main(String args[]) {
		final NumberPrint obj = new NumberPrint();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.printmap(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printmap(100);
			}
		};

		t1.start();
		t2.start();
	}
}

// Sychronization block and object 
//when you make method a synchonized, lock will applied to the object
class PrintFile {

	void writefile(int n) {
		synchronized (this) {
			for (int i = 1; i <= 4; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class SyncBlock {
	public static void main(String args[]) {
		final PrintFile obj = new PrintFile();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.writefile(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.writefile(100);
			}
		};

		t1.start();
		t2.start();
	}
}

// Synchronized Static 
// when you make static method a synchonized, lock will applied to the Class not object 
class Table {
  // 
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class SyncStatic {
	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				Table.printTable(1);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				Table.printTable(10);
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				Table.printTable(100);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				Table.printTable(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
