package systemapis;

public class B {
	int i;
	B(){
		
	}
	B(int i){
		this.i=i;
		
	}
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if( o instanceof B){
			B anotherB = (B) o;
			if(this.i == anotherB.i){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		//return (""+i);
		return String.valueOf(i);
		//return Integer.toString(i);
	}
}
