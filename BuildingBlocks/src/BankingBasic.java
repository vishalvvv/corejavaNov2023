
 class Consumer{
	 int ConsumerId;
	 int balance;
	 static String bankName="ICICI";
	 static String IFSCCODE="ICIC456123";
			 
	 
	 void deposit(int amount) {
		 this.balance=this.balance+amount;
		 System.out.println("your updated balance is" + this.balance);
	 }
	 void checkBalance() {
		 System.out.println("your balance is" + this.balance);
	 }
	static void printBankDetails() {
		 System.out.println(Consumer.bankName);
		 System.out.println(Consumer.IFSCCODE);
	 }
	 
 }
public class BankingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer Consumer1=new Consumer();
		Consumer1.ConsumerId=10000769;
		Consumer1.balance=9000;
		Consumer Consumer2=new Consumer();
		Consumer2.ConsumerId=10000845;
		Consumer2.balance=2000;
		Consumer Consumer3=new Consumer();
		Consumer3.ConsumerId=10000321;
		Consumer3.balance=6000;
		Consumer1.deposit(3000);
		Consumer1.checkBalance();
		Consumer2.checkBalance();
		Consumer.printBankDetails();
		Consumer.IFSCCODE="ICIC12476";
		Consumer.printBankDetails();


	}

}
