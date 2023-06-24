package test_21_1_22;

public class Phone extends ElectricalP{

	public Phone(String name) {
		super(name);
	}

	@Override
	public boolean onOff() {
		super.on=!super.on;
		return super.on;
	}

	@Override
	public String toString() {
		return super.on+" "+super.name;
	}
	
	public void ring(int number) {
		System.out.println("The phone called "+number);
	}
	
	public void picture() {
		System.out.println("the phone took a picture");
	}

}
