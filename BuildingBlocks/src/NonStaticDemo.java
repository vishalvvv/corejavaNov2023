
 class Customer{
	 String name;
	 String customerId;
	 long accountNumber;
	 long accountBalance;
 
 
  void printCustomerDetails() {
	  System.out.println(this.name);
		System.out.println(this.customerId);
		System.out.println(this.accountNumber);
		System.out.println(this.accountBalance);
  }
 }

public class NonStaticDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer();
		customer1.name="gnanitha jaya";
		customer1.customerId="GNAN1234565";
		customer1.accountNumber=456744127;
		customer1.accountBalance=99999999;
	//	System.out.println(customer1.name);
	//	System.out.println(customer1.customerId);
	//	System.out.println(customer1.accountNumber);
	//	System.out.println(customer1.accountBalance);
		// other way to print all details
		customer1.printCustomerDetails();
		
		System.out.println("---------------------------------------------------------");
		
		Customer customer2 = new Customer();
		customer2.name="marta purrinos";
		customer2.customerId="MART678545";
		customer2.accountNumber=5598678097l;
		customer2.accountBalance=1000000000l;
	//	System.out.println(customer2.name);
	//	System.out.println(customer2.customerId);
	//	System.out.println(customer2.accountNumber);
	//	System.out.println(customer2.accountBalance);
	//	customer2.accountBalance=11000000;
	//	System.out.println(customer2.accountBalance);
		// other way to print all details
		customer2.printCustomerDetails();
		
	}
}
 
 


