package an;

import java.util.ArrayList;


      @FunctionalInterface
   interface A{
      	void m1();
 //	void m2();
  //	void m3();
  }

  //Library
   class Al{
	@Deprecated
	void m1() {
		System.out.println("Hello");
	}
}

public class BasicAnnotatiobsDemo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //   @SuppressWarnings("rawtypes")
	//	ArrayList al = new ArrayList();
	//	System.out.println(al);
		
		Al a = new Al();
		a.m1();
	}

}
