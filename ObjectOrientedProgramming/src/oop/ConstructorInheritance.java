package oop;

class A {
	A(){
		System.out.println("A() constructor");
	}
	}

class B extends A {
	B() {
		System.out.println("B() constructor");
	}
}
public class ConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b = new B();
	}

}
