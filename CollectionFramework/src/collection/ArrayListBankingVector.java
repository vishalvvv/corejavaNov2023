package collection;


import java.util.Iterator;
import java.util.Vector;
class Consumer{
	int cid;
	String name;
	long accountNumber;
	long accountBalance;
	public Consumer(int cid, String name, long accountNumber, long accountBalance) {
		super();
		this.cid = cid;
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	 public String toString() {
		return this.cid + "\t\t\t" + this.name + "\t\t\t" + this.accountNumber + "\t\t\t" + this.accountBalance;
	 }
}
public class ArrayListBankingVector {
	
	static Vector<Consumer> Consumers = new Vector<Consumer>();
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer c1 = new Consumer(101,"alicia",10101,9000);
		Consumer c2 = new Consumer(102,"margaret",452730,50000);
		Consumer c3 = new Consumer(103,"dorothy",895232,800000);
		Consumer c4 = new Consumer(104,"charlotte",8623230,10000000);
		
		Consumers.add(c1);
		Consumers.add(c2);
		Consumers.add(c3);
		Consumers.add(c4);
       displayConsumersDetails();
       checkBalance(101);
       withdraw(104,500);
       checkBalance(104);
       withdraw(104,300);
       checkBalance(104);
       displayConsumersDetails();
       deposit(102,4000);
       checkBalance(102);
       displayConsumersDetails();
       updateConsumerDetails(103,"demi",571235);
       displayConsumersDetails();
       transferFunds(103,101,10000);
       displayConsumersDetails();
       
	}
	
	static void displayConsumersDetails() {
		System.out.println("ConsumerId \t\t Name \t\t Account Number \t\t Balance");
		System.out.println("---------------------------------------------------------------------------------------");
	Iterator<Consumer> it = Consumers.iterator();
	while(it.hasNext()) {
		Consumer cx=it.next();
		System.out.println(cx.cid + "\t\t\t" + cx.name + "\t\t\t" + cx.accountNumber + "\t\t\t" + cx.accountBalance );
	//	System.out.println(it.next());
	}
	}
	static void checkBalance(int ConsumerId) {
		Iterator<Consumer> it = Consumers.iterator();
		
		while(it.hasNext()) {
			Consumer cx = it.next();
			if(ConsumerId == cx.cid) {
				System.out.println("Your current balance is :" + cx.accountBalance);
			}
		}
	}
	static void withdraw(int ConsumerId,long amount) {
		Iterator<Consumer> it = Consumers.iterator();
		while(it.hasNext()) {
			Consumer cx = it.next();
			if(ConsumerId == cx.cid) {
				int index = Consumers.indexOf(cx);
				System.out.println("index: " + index);
				
				long updatedAmount = cx.accountBalance-amount;
				cx.accountBalance = updatedAmount;
				
				Consumers.set(index,cx);
			}
		}
	}
	 static void deposit(int ConsumerId,long amount) {
		 Iterator<Consumer> it = Consumers.iterator();
		 while (it.hasNext()) {
			 Consumer cx = it.next();
	            if (ConsumerId == cx.cid) {
	            	int index = Consumers.indexOf(cx);
	            	System.out.println("index: " + index);
	            	long updatedAmount = cx.accountBalance+amount;
	            	cx.accountBalance = updatedAmount;
	            	Consumers.set(index,cx);
	            }
		 }
	 }
	 
	 static void transferFunds(int fromConsumerId,int toConsumerId,long amount) {
		 Consumer fromConsumer=null, toConsumer=null;
		 Iterator<Consumer> it = Consumers.iterator();
		 while(it.hasNext()) {
			 Consumer cx = it.next();
			 if(fromConsumerId == cx.cid) {
				 fromConsumer = cx;
			 }
			 else if(toConsumerId == cx.cid) {
				 toConsumer = cx;
			 }
			 }
		 if(fromConsumer!=null && toConsumer!= null) {
			 if(fromConsumer.accountBalance>=amount) {
				 fromConsumer.accountBalance -= amount;
	                toConsumer.accountBalance += amount;
	                System.out.println("Transfer successful.");
	            } else {
	                System.out.println("Transfer failed. Insufficient funds.");
	            }
	        } else {
	            System.out.println("One or both Consumers not found.");
	        }
			 }
		 
	 
	 
	
	 static void updateConsumerDetails(int ConsumerId, String newName, long newAccountNumber) {
	        Iterator<Consumer> it = Consumers.iterator();
	        while (it.hasNext()) {
	            Consumer cx = it.next();
	            if (ConsumerId == cx.cid) {
	                cx.name = newName;
	                cx.accountNumber = newAccountNumber;
	                System.out.println("Consumer details updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Consumer with ID " + ConsumerId + " not found.");
	    }
	




	}


