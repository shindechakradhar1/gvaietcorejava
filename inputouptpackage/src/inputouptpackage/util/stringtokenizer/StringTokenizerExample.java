package inputouptpackage.util.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String names = "ABC,./BBC$CBC,DBC";
		StringTokenizer tokens = new StringTokenizer (names, "[$,./]");
		while(tokens.hasMoreTokens()) {
			String temp = tokens.nextToken();
			StringTokenizer token = new StringTokenizer(temp, ",");
			System.out.println(temp);
//			while(token.hasMoreTokens())
//				System.out.println(token.nextToken());
			
		}
//		tokens.it
	}
}
