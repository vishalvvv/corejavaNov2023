package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(101,"christina");
		hm.put(402, "sophia");
		hm.put(698, "raquel");
		hm.put(533, "bridgie");
		hm.put(533, "sharon");
		hm.put(714, "audrey");
		System.out.println(hm);
		System.out.println(hm.get(101));
		System.out.println(hm.get(102));
	//	Set keys = hm.keySet();
	//	System.out.println("----------------------------------------------");
	//	Iterator keysIterator = keys.iterator();
	//	while(keysIterator.hasNext()) {
	//		System.out.println(keysIterator.next());
	//	}
	//	System.out.println("----------------------------------------------");
		
	//	System.out.println("Values");
	//	Collection values =hm.values();
	//	Iterator valuesIterator = values.iterator();
	//	while(valuesIterator.hasNext()) {
	//		System.out.println(valuesIterator.next().equals("sharon"));
	//	}
	//	System.out.println("----------------------------------------------");
		Set<Entry> set =hm.entrySet();
		Iterator it =set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
