package Thread;

class Foo {

	boolean onem = false;
	boolean twom = false;

	synchronized public void one() throws InterruptedException {
		System.out.println("one");
		onem = true;
		notifyAll();
	}

	public synchronized void two() throws InterruptedException {

		while (!onem) {
		  wait();
		}
		twom = true;
		notifyAll();
		System.out.println("two");
	}

	public synchronized void three() throws InterruptedException {
		while (!twom) {
			wait();
		}

		notifyAll();
		System.out.println("three");
	}
}

class FooThred extends Thread{
	Foo foo;
	int method;
	public FooThred(Foo foo,int key) {
		this.foo=foo;
		this.method=key;
	}
	
	@Override
	public void run() {
		
		
		switch (method) {
		case 1:
			try {
				foo.one();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			 try {
				foo.two();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 3:
			try {
				foo.three();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}
	
	
}

public class ThreadOneTwoThree {

	public static void main(String[] args) {

		Foo f1 = new Foo();
		FooThred ft1=new FooThred(f1,3);
		ft1.start();
		FooThred ft2=new FooThred(f1,2);
		ft2.start();
		FooThred ft3=new FooThred(f1,1);
		ft3.start();
		
		
	Foo	f2 = new Foo();
		
	Thread t1=new Thread(new Runnable() {
		        public void run(){
		           try {
					f2.three();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        }
		    });
		t1.start();
	
		Thread t2=new Thread(new Runnable() {
        public void run(){
           try {
			f2.two();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
		});
		t2.start();
		Thread t3=new Thread(new Runnable() {
        public void run(){
           try {
			f2.one();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
		});
		t3.start();
	}
	
}
