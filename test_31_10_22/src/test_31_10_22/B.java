package test_31_10_22;

public class B extends A{

	
	private int x;
	public B() {
		super("b");
	}
	public void func() {
		System.out.println("in a");
		System.out.println("in b");
	}
	
	public String toString() {
		return str +" "+ x;
	}
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.toString());
		b.func();

	}

}
