package test_31_10_22;

public class ClassC extends ClassA{
private int x;
public ClassC() {
	super("c");
}
public void setX(int x) {
	this.x=x;
}

public int getC() {
	return x;
}

	public static void main(String[] args) {
		
		ClassA [] arr = new ClassA[3];
		arr[0] = new ClassB();
		arr[1] = new ClassB();
		arr[2] = new ClassC();
		
		arr[0].func();
		arr[1].func();
		ClassB cb = new ClassB();
		
	}

}
