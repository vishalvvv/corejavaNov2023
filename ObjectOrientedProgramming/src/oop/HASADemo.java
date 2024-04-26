package oop;

class EmailSender{
	public void sendEmail() {
		System.out.println("Email Sent");
	}
}
class SMSSender{
	public void sendSMS() {
		System.out.println("SMS Sent");
	}
}
class WhatsAppSender{
	public void sendWhatsAppMessage() {
		System.out.println("Whatsapp message sent");
	}
}
class Transaction{
	EmailSender emailSender = new EmailSender();
	SMSSender smsSender = new SMSSender();
	WhatsAppSender whatsAppSender = new WhatsAppSender();
	
	public void transact() {
		System.out.println("Transaction is completed");
		emailSender.sendEmail();
		smsSender.sendSMS();
		whatsAppSender.sendWhatsAppMessage();
	}
}

public class HASADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Transaction tx = new Transaction();
tx.transact();
	}

}
