package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile("s.l");
		Matcher matcher = pattern.matcher("s@l");
		boolean result = matcher.matches();
		System.out.println(result);
		System.out.println(Pattern.compile("abc").matcher("abc").matches());
		System.out.println(Pattern.matches("s[abc]m", "sam"));
	}

}
