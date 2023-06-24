package test_31_10_22;

public class ClassA {
	protected String str;
	public ClassA(String str) {
		this.str=str;
	}
	public void func() {
		System.out.println("Class A"+str);
	}

	public boolean equals(String other) {
		return str.equals(other);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA("a");
		ClassA b = new ClassA("a");
		System.out.println(a.equals("a"));
		

		
	}

}
