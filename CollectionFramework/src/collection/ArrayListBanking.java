package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Client{
	int cid;
	String name;
	long accountNumber;
	long accountBalance;
	public Client(int cid, String name, long accountNumber, long accountBalance) {
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
public class ArrayListBanking {
	
	static ArrayList<Client> clients = new ArrayList<Client>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client(101,"alicia",10101,9000);
		Client c2 = new Client(102,"margaret",452730,50000);
		Client c3 = new Client(103,"dorothy",895232,800000);
		Client c4 = new Client(104,"charlotte",8623230,10000000);
		
		clients.add(c1);
		clients.add(c2);
		clients.add(c3);
		clients.add(c4);
       displayClientsDetails();
       checkBalance(101);
       withdraw(104,500);
       checkBalance(104);
       withdraw(104,300);
       checkBalance(104);
       displayClientsDetails();
       deposit(102,4000);
       checkBalance(102);
       displayClientsDetails();
       updateClientDetails(103,"demi",571235);
       displayClientsDetails();
       transferFunds(103,101,10000);
       displayClientsDetails();
       
	}
	
	static void displayClientsDetails() {
		System.out.println("ClientId \t\t Name \t\t Account Number \t\t Balance");
		System.out.println("---------------------------------------------------------------------------------------");
	Iterator<Client> it = clients.iterator();
	while(it.hasNext()) {
		Client cx=it.next();
		System.out.println(cx.cid + "\t\t\t" + cx.name + "\t\t\t" + cx.accountNumber + "\t\t\t" + cx.accountBalance );
	//	System.out.println(it.next());
	}
	}
	static void checkBalance(int clientId) {
		Iterator<Client> it = clients.iterator();
		
		while(it.hasNext()) {
			Client cx = it.next();
			if(clientId == cx.cid) {
				System.out.println("Your current balance is :" + cx.accountBalance);
			}
		}
	}
	static void withdraw(int clientId,long amount) {
		Iterator<Client> it = clients.iterator();
		while(it.hasNext()) {
			Client cx = it.next();
			if(clientId == cx.cid) {
				int index = clients.indexOf(cx);
				System.out.println("index: " + index);
				
				long updatedAmount = cx.accountBalance-amount;
				cx.accountBalance = updatedAmount;
				
				clients.set(index,cx);
			}
		}
	}
	 static void deposit(int clientId,long amount) {
		 Iterator<Client> it = clients.iterator();
		 while (it.hasNext()) {
			 Client cx = it.next();
	            if (clientId == cx.cid) {
	            	int index = clients.indexOf(cx);
	            	System.out.println("index: " + index);
	            	long updatedAmount = cx.accountBalance+amount;
	            	cx.accountBalance = updatedAmount;
	            	clients.set(index,cx);
	            }
		 }
	 }
	 
	 static void transferFunds(int fromClientId,int toClientId,long amount) {
		 Client fromClient=null, toClient=null;
		 Iterator<Client> it = clients.iterator();
		 while(it.hasNext()) {
			 Client cx = it.next();
			 if(fromClientId == cx.cid) {
				 fromClient = cx;
			 }
			 else if(toClientId == cx.cid) {
				 toClient = cx;
			 }
			 }
		 if(fromClient!=null && toClient!= null) {
			 if(fromClient.accountBalance>=amount) {
				 fromClient.accountBalance -= amount;
	                toClient.accountBalance += amount;
	                System.out.println("Transfer successful.");
	            } else {
	                System.out.println("Transfer failed. Insufficient funds.");
	            }
	        } else {
	            System.out.println("One or both clients not found.");
	        }
			 }
		 
	 
	 
	
	 static void updateClientDetails(int clientId, String newName, long newAccountNumber) {
	        Iterator<Client> it = clients.iterator();
	        while (it.hasNext()) {
	            Client cx = it.next();
	            if (clientId == cx.cid) {
	                cx.name = newName;
	                cx.accountNumber = newAccountNumber;
	                System.out.println("Client details updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Client with ID " + clientId + " not found.");
	    }
	

}