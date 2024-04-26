package oop;

class Product{
	
	Product(){
		System.out.println("Constructor called");
	}
	int pid;
	String name;
	int price;
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.pid=101;
		product.name="XYZ";
		product.price=909;
		System.out.println(product.pid);

	}

}
