package j8features;

interface X{
	void m1(int a);
}

public class MethodRef {
	
	static void xyz(int x) {
		System.out.println("XYZ");
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x = MethodRef::xyz;
		x.m1(10);
	}

}
