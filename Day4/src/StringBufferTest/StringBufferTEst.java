package StringBufferTest;

public class StringBufferTEst {
	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer();
		sb.append("hello ");
		
		sb.append("Java ");
		sb.append("hi");
		String str = sb.toString();
		System.out.println(str);
		String substr = sb.substring(0, 4);
		System.out.println(substr);*/
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append(12).append('d');
		System.out.println(sb);
		sb.setCharAt(0,'x');
		System.out.println(sb);
		sb.insert(1, 3.14);
		System.out.println(sb);
		
		char[] ca = new char[sb.length()];
		sb.getChars(0, sb.length(), ca, 0);
		for(int i = 0; i < ca.length; i++)
			System.out.print(ca[i]);
		System.out.println();
	}
}
