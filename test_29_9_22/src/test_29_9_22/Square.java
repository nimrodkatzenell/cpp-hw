package test_29_9_22;
import java.util.*;
public class Square implements Smaller{
private int area;
public Square(int area) {
	this.area=area;
}
public int getArea() {
	return this.area;
}
	public boolean isSmaller(Smaller other) {
		Square square = (Square) other;
		return this.getArea()<square.getArea();
		
	}
	public static Smaller getMin(ArrayList<Smaller> list) {
		Smaller a = list.get(0);
		for(Smaller temp:list) {
			if(temp.isSmaller(a))
			{
				a=temp;
			}
		}
		return a;
		
	}
	public String toString() {
		return Integer.toString(area);
	}
	public static void main(String[] args) {
		Square s1= new Square(10000);
		Square s2 = new Square(2);
		Square cat1= new Square(3);
		Square cat2 = new Square(4);
		ArrayList<Smaller> list = new ArrayList<Smaller>();
		list.add(s1);
		list.add(s2);
		list.add(cat1);
		list.add(cat2);
		System.out.println(getMin(list).toString());

		
	}

}
