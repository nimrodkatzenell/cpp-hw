package test_31_10_22;

public class ClassB extends ClassA{

	public ClassB() {
		super("b");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void func()
	{	
		System.out.println("in class B");
	}

	public static void main(String[] args) {
		ClassB b= new ClassB();
		b.func();
		
	}

}
