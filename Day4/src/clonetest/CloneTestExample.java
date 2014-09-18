package clonetest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CloneTestExample {
	public static void main(String[] args) {
		A a = new A(10);
		//A aCopy = a; //Swallow Copy
		A aCopy = a.clone(); // Deep Copy
		
		a.print();
		aCopy.print();
		a.set(20);
		a.print();
		aCopy.print();
		Class aClass = a.getClass();
		System.out.println(aClass.getName());
		
		Field[] aField = aClass.getFields();
		for(int i = 0; i<aField.length;i++){
			System.out.println(aField[i].getName());
		}
		Method[] aMethod = aClass.getMethods();
		for(int i =0 ; i<aMethod.length ; i++){
			System.out.print(aMethod[i].getDeclaringClass() + ".");
			System.out.print(aMethod[i].getName());
			System.out.print("(");
			Class[] paramsClass = aMethod[i].getParameterTypes();
			for(int j = 0;i<paramsClass.length;j++){
				System.out.print(paramsClass[j].getName());
			}
			System.out.println(")");
		}
	}
	
	
}
