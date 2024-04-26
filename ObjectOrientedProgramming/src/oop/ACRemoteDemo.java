package oop;

interface ACRemote {
	void turnonOff();
	void increaseTemp();
	void decreaseTemp();
	void swingMode();
}

 class MotherBoard implements ACRemote {
  int currentTemperature = 26;
  int lowestTemp = 16;
  int highestTemp = 32;
  boolean currentACStatus = false;
	@Override
	public void turnonOff() {
		// TODO Auto-generated method stub
		if(this.currentACStatus == false) {
			this.currentACStatus = true;
			System.out.println("AC turned on !");
		}
		else {
			this.currentACStatus = false;
			System.out.println("AC turned off! ");
		}
		
	}

	@Override
	public void increaseTemp() {
		// TODO Auto-generated method stub
			if(this.currentACStatus == true) {
				if(currentTemperature > lowestTemp && currentTemperature < highestTemp) {
					this.currentTemperature++;
					System.out.println("Temp Now:"+ this.currentTemperature);
				}
			}
			else {
				System.out.println("Please turn on the AC First");
			}
			
		}
	

	@Override
	public void decreaseTemp() {
		// TODO Auto-generated method stub
		if(this.currentACStatus == true) {
			if(currentTemperature > lowestTemp ) {
			this.currentTemperature--;
			System.out.println("Temp Now:" + this.currentTemperature);
			}
		else {
			System.out.println("Please turn on the AC First");
		}
	}
	}

	@Override
	public void swingMode() {
		// TODO Auto-generated method stub
		System.out.println("Swing mode activated");
	}
	 
 }

public class ACRemoteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ACRemote remote = new MotherBoard();
         
         remote.increaseTemp();
         remote.turnonOff();
         remote.increaseTemp();
         remote.increaseTemp();
         remote.increaseTemp();
         remote.increaseTemp();
         remote.decreaseTemp();
         remote.decreaseTemp();
         remote.swingMode();
         
         
         
         
	}

}
