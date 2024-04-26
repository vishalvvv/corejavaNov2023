package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(100);
		al.add("java");
		al.add("react");
		al.add(true);
		al.add(false);
		al.add(true);
		al.add(false);
		al.add(true);
		al.add(false);
		System.out.println(al);
		System.out.println(al.contains(true));
		System.out.println(al.indexOf("java"));
		
	//	List al2=al.reversed();
	//	System.out.println(al2.get(0));
	//	System.out.println(al.reversed());
	//	System.out.println(al.get(0));
	//	for(int i=0;i<al.size();i++) {
	//		System.out.println(al.get(i));
	//	}
		ListIterator li = al.listIterator();
		System.out.println("In Forward Direction");
		
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}

		System.out.println("In Reverse Direction");
		
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
	}

}
