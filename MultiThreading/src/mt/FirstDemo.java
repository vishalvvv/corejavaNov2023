package mt;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());

	}

}
