package test_21_1_22;

public class B extends A implements MyInter{
	@Override
	public String toString() {
		return "B";
	}
	
	public void interfaceCall() {
		System.out.println("B Call InterFace MyInter");
	}
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.toString());
		b.interfaceCall();
		
	}
	
	

}
