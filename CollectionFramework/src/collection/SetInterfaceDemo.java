package collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set hs = new HashSet();
		hs.add("h1");
		hs.add("h2");
		hs.add(10);
		hs.add(1);
		hs.add(100);
		System.out.println(hs);
	}

}
