package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("hello");
		hs.add(true);
		hs.add(100.02);
		hs.add(true);
		hs.add(10);
		System.out.println(hs);
		System.out.println(hs.contains(10));
		System.out.println(hs.isEmpty());
		hs.remove(10);
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator it = hs.iterator();
	//	System.out.println(it.hasNext());
	//	System.out.println("elm:"+it.next());
	//	System.out.println(it.hasNext());
	//	System.out.println("elm:"+it.next());
	//	System.out.println(it.hasNext());
	//	System.out.println("elm:"+it.next());
	//	System.out.println(it.hasNext());
		
		
		System.out.println("------------------------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------------");
		System.out.println("using for loop");
		// System.out.println(it.hasNext);
		Iterator it2 = hs.iterator();
		
		for(; it2.hasNext();) {
			System.out.println(it2.next());
		}
		
		System.out.println("-------------------------------");
		System.out.println("hs:"+hs);
		Object obj[] = hs.toArray();
		System.out.println(obj[2]);
	}

}
