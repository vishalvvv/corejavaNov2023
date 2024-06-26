package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Bank{
	String name;
	String ifscCode;
	long branchCode;
	public Bank(String name, String ifscCode, long branchCode) {
		super();
		this.name = name;
		this.ifscCode = ifscCode;
		this.branchCode = branchCode;
	}
	
	public String toString() {
		return this.name+"\t"+this.ifscCode+"\t"+this.branchCode;
	}
	
}
public class ArrayListtDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Bank("ICICI","ICIC147456",5578764);
		Bank b2 = new Bank("HDFC","HDFC123765",4123084);
		Bank b3 = new Bank("AXIS","AXIS65438",7789341);
		
		ArrayList<Bank> al = new ArrayList<Bank>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		System.out.println(al);
		
		System.out.println("-------------");
		
		// System.out.println(al.reversed());
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator li = al.listIterator(al.size());
	while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
				

	}

}
