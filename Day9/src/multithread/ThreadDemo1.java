package multithread;
 
class A extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
	}
	
}
class B extends Thread{
	public void run() {
		System.out.println("Current ID of B:" + Thread.currentThread().getId());
	}
	
	
}
class C extends Thread{
	public void run() {
		System.out.println("Current ID of C:" + Thread.currentThread().getId());
	}
	
}
class D implements Runnable{
	
		public void run() {
			System.out.println("Current ID of D:" + Thread.currentThread().getId());
		}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();
		B b  = new B();
		b.setPriority(Thread.NORM_PRIORITY);
		b.start();
		C c = new C();
		c.setPriority(Thread.MIN_PRIORITY);
		c.start();
		D d  = new D();
		Thread th = new Thread(d);
		//d.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MAX_PRIORITY);
		th.start();
		for(int i=0; i<3; i++) {
		System.out.println("ID of Main Method:"+ Thread.currentThread().getId());
		}
	}

}
