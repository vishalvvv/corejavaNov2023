package CS;

class Product{
	String name;
	long price;
	String brand;
}


public class Iterative {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int initialValue = 1;
	//	while(initialValue <= 10) {
	//		System.out.println(initialValue);
	//		initialValue++;
		//	}
		
	//	String usernames[] = {"richa","pooja","ayesha","vidya","lisa"};
	//	int index=0;
	//	while(index<usernames.length) {
	//		System.out.println(usernames[index]);
	//		index++;
	//	}
		
		Product product1 = new Product();
		product1.name="product 1";
		product1.price=89999;
		product1.brand="brand 1";
		Product product2 = new Product();
		product2.name="product 2";
		product2.price=7999;
		product2.brand="brand 1";
		Product product3 = new Product();
		product3.name="product 3";
		product3.price=999;
		product3.brand="brand 1";
		
		Product products[]= {product1,product2,product3};
		int index=0;
		while(index<products.length) {
			Product p = products[index];
			System.out.println(p.name+"\t"+p.price+"\t"+p.brand);
			index++;
		}
		
		
		
		

	}

}
