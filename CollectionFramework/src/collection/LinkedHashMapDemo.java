package collection;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(101,"christina");
		lhm.put(402, "sophia");
		lhm.put(698, "raquel");
		lhm.put(533, "bridgie");
		lhm.put(533, "sharon");
		lhm.put(714, "audrey");
		System.out.println(lhm);
		System.out.println(lhm.get(101));
		System.out.println(lhm.get(102));
	
	Set<Entry> set =lhm.entrySet();
	Iterator it =set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}

}
