package strings;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "julie";
		System.out.println(s1);
		String s2 = "benz";
		s1 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s1.charAt(0));
		System.out.println(s1.equals("juliebenz"));
		System.out.println(s1.equalsIgnoreCase("Juliebenz"));
		System.out.println(s1.isEmpty());
	}

}
