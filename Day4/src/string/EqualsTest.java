package string;

public class EqualsTest {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello java!"
				+ "";
		String s5 = s4.substring(2, 4);
		System.out.println(s4.trim());
		System.out.println(s5);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
	}
}
