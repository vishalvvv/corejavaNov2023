package oop;

class ICICIBank{
	String nameOfTheBank="ICICI";
	String ifscCode="ICIC117657";
	String location="Gachibowli";
}

class Customer extends ICICIBank{
	String name;
	String custonerId;
	long accountNumber;
	long accountBalance;
	
	void printCustomerDetails() {
		System.out.println(this.name+"\t"+this.custonerId+"\t"+this.accountNumber+"\t"+this.accountBalance);
	 System.out.println(this.nameOfTheBank+"\t"+this.ifscCode+"\t"+this.location);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.name="jennifer";
		customer.custonerId="4569845LO";
		customer.accountNumber=4567445682L;
		customer.accountBalance=100000000L;
		customer.printCustomerDetails();

	}

}
