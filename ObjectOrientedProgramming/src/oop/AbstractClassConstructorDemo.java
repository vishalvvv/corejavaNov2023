package oop;

interface A3 {
	void m1();
	void m2();
}

abstract class A3Impl implements A3{
	public A3Impl() {
		System.out.println("A3Impl constructor");
	}
	public void m1() {
		System.out.println("m1()");
	}
}
class A3ImplHelper extends A3Impl{
	public A3ImplHelper() {
		System.out.println("A3ImplHelper Constructor called!");
	}
	public void m2() {
		
	}
}

public class AbstractClassConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new A3ImplHelper();
	}

}
