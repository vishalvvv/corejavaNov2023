package oop;

class Prodct{
	String pid = "101";
	String name = "Product1";
	long price=1200;
	
	void getProductDetails() {
		System.out.println(pid+"\t"+name+"\t"+price);
	}
}

class Amazon extends Prodct{
	void getProductDetails() {
		price = 800;
		System.out.println(pid+"\t"+name+"\t"+price);
	}
}


public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon  amazon = new Amazon();
		amazon.getProductDetails();
	}

}
