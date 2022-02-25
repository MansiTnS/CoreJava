package day9;

class A extends Thread{
	public void run() {
		System.out.println("Thread A ID: " + Thread.currentThread().getId());
		}
}
class B extends Thread{
	public void run() {
		System.out.println("Thread B ID: " + Thread.currentThread().getId());
		}
}

class C extends Thread{
	public void run() {
		System.out.println("Thread C ID: " + Thread.currentThread().getId());
		}
	void m1() {
			System.out.println("I am method m1");
	}
	void m2() {
		this.m1();
	}
}

class D implements Runnable {
	public void run() {
		System.out.println("Thread D ID: " + Thread.currentThread().getId());
		}
	
}
public class ThreadDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();
		
		
		B b = new B();
		b.setPriority(Thread.NORM_PRIORITY);
		b.start();
		
		C c = new C();
		c.setPriority(Thread.MAX_PRIORITY);
		c.start();
		
		
		D d = new D();
		Thread obj = new Thread(d);
		obj.start();
		
		
		
		for(int i =0; i<4; i++) {
		System.out.println("Thread Main ID: " + Thread.currentThread().getId());
		}
	}

}
