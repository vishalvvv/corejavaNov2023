
public class StaticVariables {
      static int counter=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticVariables.counter);  // 1
		StaticVariables.counter++;  // 2
		StaticVariables.counter++; // 3
		StaticVariables.counter++;  // 4
		System.out.println(StaticVariables.counter);  // 4
	}

}
