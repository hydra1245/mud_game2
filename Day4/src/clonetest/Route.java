package clonetest;

public class Route implements Cloneable {
	int[] path;
	double cost;
	String routeName;
	
	public Route clone(){
		Route clone = new Route();
		//��� ������ ����
		clone.routeName = this.routeName;
		if(path != null){
		clone.path = this.path.clone();
		}//�迭�� ��ü��
		clone.cost = this.cost;
		return clone;
	}
}
