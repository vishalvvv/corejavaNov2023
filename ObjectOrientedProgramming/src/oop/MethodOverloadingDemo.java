package oop;

class Calc{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Calc calc = new Calc();
   calc.add(10, 20);
   calc.add(10, 20, 30);
	}

}
