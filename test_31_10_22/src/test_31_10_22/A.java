package test_31_10_22;

public class A {
	private final int NUM = 7;
	protected String str;
	public A(String str) {
		this.str=str;
	}
	
	public void func() {
		System.out.println("in class a");
	}
	
	public String toString() {
		return str;
	}

}
