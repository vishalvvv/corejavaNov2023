package an;

class Super{
	void checkIfTheUserExistsInDatabase() {
		System.out.println("m1()");
		}
}
class Sub extends Super {
	
	@Override
	void checkIfTheUserExistsInDatabase() {
		System.out.println("m1() in Sub");
	}
}
public class BasicAnnotationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Sub s = new Sub();
  
	}

}
