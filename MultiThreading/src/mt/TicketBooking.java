package mt;

class Booking implements Runnable{
	
	int ticketsAvailable = 1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tickets Available: "+ ticketsAvailable);
		System.out.println("Booking Request for the Passenger: "+Thread.currentThread().getName());
		synchronized(this){
		if(ticketsAvailable > 0) {
			System.out.println("Ticket Booked for: " + Thread.currentThread().getName());
			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ticketsAvailable--;
			}
			else {
				System.out.println("No Tickets Available");
			}
		}
		}
			}

public class TicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Booking b1 = new Booking();
   Thread t1 = new Thread(b1);
   t1.setName("P1");
   Thread t2 = new Thread(b1);
  // Booking b2 = new Booking();
   t2.setName("P2");
   t1.start();
   t2.start();
	}

}
