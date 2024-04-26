package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(200);
		lhs.add(true);
		lhs.add("hello");
		lhs.add(true);
		lhs.add("hello");
		System.out.println(lhs);
		

	}

}
