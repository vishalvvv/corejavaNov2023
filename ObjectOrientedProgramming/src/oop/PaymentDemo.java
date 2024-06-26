package oop;

 class CashOnDelivery{
	
	String houseNumber;
	 String landMark;
	 String area;
	 String city;
	 
	 public CashOnDelivery(String houseNumber, String landMark, String area, String city) {
			super();
			this.houseNumber = houseNumber;
			this.landMark = landMark;
			this.area = area;
			this.city = city;
		}
	 
	 public void showDetails() {
		 System.out.println(this.houseNumber+"\t"+this.landMark+"\t"+this.area+"\t"+this.city);
	 }
 }
  class CreditCard{
	  String nameOnTheCard;
	  long accountNumber;
	  int cvv;
	public CreditCard(String nameOnTheCard, long accountNumber, int cvv) {
		super();
		this.nameOnTheCard = nameOnTheCard;
		this.accountNumber = accountNumber;
		this.cvv = cvv;
	}
	  public void showDetails() {
		  System.out.println(this.nameOnTheCard+"\t"+this.accountNumber+"\t"+this.cvv);
	  }
  }
  
   class UPI{
	   long mobileNumber;

	public UPI(long mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
	}
	
	public void showDetails() {
		System.out.println(this.mobileNumber);
	}
	   
   }
   
   class Payment{
	   void pay(CashOnDelivery cod) {
		   cod.showDetails();
	   }
	   void pay(UPI upi) {
		   upi.showDetails();
	   }
	   void pay(CreditCard cc) {
		   cc.showDetails();
	   }
   }
 

public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CashOnDelivery cashOnDelivery = new CashOnDelivery("787888/12s","near temple","hitech city","Hyderabad");
	 Payment payment = new Payment();
	 payment.pay(cashOnDelivery);
	 UPI upi = new UPI(818234578L);
	payment.pay(upi);
	 
	}

}
