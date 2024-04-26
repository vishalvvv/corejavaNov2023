package oop;

class Client{
	String name;
	String clientId;
	long accountNumber;
	long accountBalance;
	
	Client(String nameParam,String clientIdParam,long accountNumberParam,long accountBalanceParam){
		this.name=nameParam;
		this.clientId=clientIdParam;
		this.accountNumber=accountNumberParam;
		this.accountBalance=accountBalanceParam;
	}
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Michelle","hdfc4568756",75546567L,99999999L);
		System.out.println(client.name);
		System.out.println(client.clientId);

	}

}
