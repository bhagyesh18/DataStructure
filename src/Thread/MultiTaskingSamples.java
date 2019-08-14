package Thread;

//Program of performing single task by multiple threads
class MTask1 extends Thread {
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		MTask1 t1 = new MTask1();
		MTask1 t2 = new MTask1();
		MTask1 t3 = new MTask1();

		t1.start();
		t2.start();
		t3.start();
	}
}

//Program of performing single task by multiple threads
class MTask2 implements Runnable {
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		Thread t1 = new Thread(new MTask2());// passing annonymous object of MTask2 class
		Thread t2 = new Thread(new MTask2());

		t1.start();
		t2.start();

	}
}

//multiple tasks by multiple threads?
//Program of performing two tasks by two threads
class Simple1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
}

class Simple2 extends Thread {
	public void run() {
		System.out.println("task two");
	}
}

class MTask3 {
	public static void main(String args[]) {
		Simple1 t1 = new Simple1();
		Simple2 t2 = new Simple2();

		t1.start();
		t2.start();
	}
}

//multiple tasks by multiple threads?
// Program of performing two tasks by two threads 
// Annonymous class 
class MTask4 {
	public static void main(String args[]) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("task one");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("task two");
			}
		};

		t1.start();
		t2.start();
	}
}

// Program of performing two tasks by two threads
// Implementing Runnable
class MTask5 {
	public static void main(String args[]) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("task one");
			}
		};

		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("task two");
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}

public class MultiTaskingSamples {

	public static void main(String[] args) {

	}

}
