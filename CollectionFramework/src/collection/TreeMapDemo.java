package collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap treemap = new TreeMap();
		treemap.put(90,"elizabeth");
		treemap.put(20, "ann margaret");
		treemap.put(58, "ava");
		treemap.put(45, "marilyn");
		treemap.put(13, "rebecca");
		System.out.println(treemap);
		System.out.println(treemap.descendingMap());

	}

}
