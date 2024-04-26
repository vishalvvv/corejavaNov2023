package strings;

public class StringsDemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);  // address are checked
		String s3 = s2;
		System.out.println(s3 == s2);
		
		String s4="digital";
		String s5 = "digital";
		System.out.println(s4 == s5);
		s4 = s4.concat("lync");
		System.out.println(s4 == s5);
		String  s6 = "digital";
		System.out.println(s5 == s6);
		String s7 = "digitallync";
		System.out.println(s7 == s4);
		System.out.println(s7);
		System.out.println(s4);
		s5 = s5.concat("lync");
		String s8 = "digital";
		String s9 ="digitallync";
		System.out.println(s5 == s8);
		System.out.println(s9 == s4);

	}

}
