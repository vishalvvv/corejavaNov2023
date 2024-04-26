package oop;
class A1{
void m1() {
	System.out.println("m1() called");
}
void m2() {
	System.out.println("m2() called");
}
}
class B1 extends A1{
void m2() { // method is overriden
	System.out.println("m2() called in B1");
}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B1 b1 = new B1();
        b1.m1();
        b1.m2();
	}

}
