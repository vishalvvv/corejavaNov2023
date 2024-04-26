package oop;

interface A2{
	void m1();
	void m2();
	void m3();
	void m4();
}
 abstract class A2Impl implements A2{
	 public void m1() {
		 System.out.println("m1() called");
	 }
	 public void m2() {
		 System.out.println("m2() called");
	 }
	 public abstract void m3();
	 public abstract void m4();
 }
 
 class A2ImplHelper extends A2Impl{
	 public void m3() {
		 System.out.println("m3 called");
	 }
	 public void m4() {
		 System.out.println("m4 called");
	 }
	 
 }

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A2 a = new  A2ImplHelper();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
	}

}
