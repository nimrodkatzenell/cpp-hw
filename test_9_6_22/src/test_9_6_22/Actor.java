package test_9_6_22;

public class Actor extends Artist {

	public Actor(String name, String stageName, int age, String type) {
		super(name, stageName, age, type);
	}

	@Override
	public void perform() {
		System.out.println("The actor "+name+" is performing");
	}

}
