package arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(500);
		al.add("courtney");
		al.add(true);
		al.add(false);
		al.add("cox");
		System.out.println(al);
		System.out.println(al.contains("cox"));
		System.out.println(al.contains("abc"));
		al.add(1,200);
		System.out.println(al);

	}

}
