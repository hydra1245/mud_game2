package stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String text = "Now is the time for all good men (and women)...";
		StringTokenizer st = new StringTokenizer(text);
		while(st.hasMoreTokens()){
			String word = st.nextToken();
			System.out.println(word);
		}
		
		String text2 = "http://www.naver.com";
		StringTokenizer st2 = new StringTokenizer(text2, "/:.");
		while(st2.hasMoreTokens()){
			String text3 = st2.nextToken();
			System.out.println(text3);
		}
	}
}
