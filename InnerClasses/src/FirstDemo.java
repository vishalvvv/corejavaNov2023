class Outer{
	int a=100;
	int b=200;
	
	void displayOuter() {
		System.out.println(a);
		System.out.println(b);
		}
	class Inner{
		int c=300;
		int d=400;
		
		void displayInner() {
			System.out.println(c);
			System.out.println(d);
		}
	}
 //	void displayInnerClassesDetailsInOuter() {
	//	 Inner inner = new Inner();
	//	 System.out.println(inner.c);
	//	 System.out.println(inner.d);
	//	 inner.displayInner();
	//  }
	 
}

class OuterSub extends Outer{
	void accessInnerClass() {
		OuterSub ob = new OuterSub();
		OuterSub.Inner i = ob.new Inner();
		System.out.println(i.c);
	}
}

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Outer outer = new Outer();
	//	System.out.println(outer.a);
	//	System.out.println(outer.b);
//		outer.displayOuter();
	//	Outer.Inner inner = outer.new Inner();
	//	System.out.println(inner.c);
	//	System.out.println(inner.d);
	//	inner.displayInner();
		
	//	Outer outer = new Outer();
	//	outer.displayInnerClassesDetailsInOuter();
		
	//	outer.new Inner();  error
		
		OuterSub os = new OuterSub();
		os.accessInnerClass();
		
		
		
	}

}