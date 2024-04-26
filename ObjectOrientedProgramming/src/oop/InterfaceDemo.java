package oop;

 interface X{
	 void m1();
	 void m2();
 }
 
 
  class XImpl implements X{
	  public void m1() {
		  System.out.println("m1() called");
	  }
	  public void m2() {
		  System.out.println("m2() called");
	  }
  }
  
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x = new XImpl();
		x.m1();
		x.m2();
	}

}
