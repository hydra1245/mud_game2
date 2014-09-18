package classclass;

public class ClassTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class clazz = null;
		A a = new A(0);
	//	a.getClass();
		clazz = a.getClass();
		
		A a1 = (A) clazz.newInstance();
		System.out.println(a);
		System.out.println(a1);
	}
}
