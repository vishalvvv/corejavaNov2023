package j8features;

interface A{
	void m1();
}

class AImpl implements A{
	public void m1() {
		System.out.println("m1()");	
	}
}
public class WithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		A aa = new AImpl();
		aa.m1();

	}

}
