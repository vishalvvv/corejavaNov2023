package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
	//	ts.add(10);
	//	ts.add(20);
	//	ts.add(9);
	//	ts.add(19);
	//	ts.add(2);
		ts.add("hyderabad");
		ts.add("bangalore");
		ts.add("Chennai");
		ts.add("Mangalore");
		ts.add("bihar");
		ts.add("Assam");
		System.out.println(ts);
		Iterator it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("CONTAINS:"+ts.contains("Hyderabad"));
		System.out.println(ts.first());
		System.out.println(ts.isEmpty());
		ts.clear();
		System.out.println(ts.isEmpty());

	}

}
