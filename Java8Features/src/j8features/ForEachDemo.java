package j8features;

import java.util.HashSet;
import java.util.Iterator;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(3000);
		hs.add(800);
		
	//	Iterator it = hs.iterator();
	//	while(it.hasNext()) {
	//		System.out.println(it.next());
	//	}
		
		hs.forEach(x -> System.out.println(x));

	}

}
