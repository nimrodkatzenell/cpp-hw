package test_21_1_22;

public class Fax extends ElectricalP{

	
	public Fax(String name) {
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
		System.out.println("The fax called "+number);
	}
	
	public static void main(String[] args) {
		Fax fax = new Fax("lollll");
		System.out.println(fax.toString());
		fax.ring(45654);
	}

}
