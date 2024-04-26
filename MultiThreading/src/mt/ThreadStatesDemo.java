package mt;

class NewThread extends Thread{
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method called");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);  //Blocked state
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run method execution is finished by:" + Thread.currentThread().getName());
		System.out.println("-----------------------------------------------------------");
	}
}

public class ThreadStatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NewThread t1 = new NewThread();
      t1.setName("Thread-one");
      System.out.println("T1 State:"+t1.getState());
      t1.setPriority(9);
      t1.start();
      System.out.println("T1 State:"+t1.getState());
      NewThread t2 = new NewThread();
      t2.setName("Thread-Two");
      System.out.println("T2 State:" +t2.getState());
      t2.setPriority(1);
      t2.start();
      System.out.println("T2 State:" + t2.getState());
      
      NewThread t3 = new NewThread();
      t3.setName("Thread-Three");
      System.out.println("T3 State:" + t3.getState());
      t3.start();
      System.out.println("T3 State:" + t3.getState());
      System.out.println("T1 State:" + t1.getState());
      System.out.println("T2 State:" + t2.getState());
      
	}

}
