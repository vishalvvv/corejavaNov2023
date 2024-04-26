package mt;
// implementing Runnable interface
class Thread1 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method called in Thread1");
	}
}
class Thread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method called in Thread2");
	}
}


public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t2 = new Thread2();
		t2.start();
		
		Thread1 t1 =  new Thread1();
		Thread t12 = new Thread(t1);
		t12.start();
	}

}
