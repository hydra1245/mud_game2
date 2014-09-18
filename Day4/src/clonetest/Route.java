package clonetest;

public class Route implements Cloneable {
	int[] path;
	double cost;
	String routeName;
	
	public Route clone(){
		Route clone = new Route();
		//멤버 변수의 복제
		clone.routeName = this.routeName;
		if(path != null){
		clone.path = this.path.clone();
		}//배열은 객체임
		clone.cost = this.cost;
		return clone;
	}
}
