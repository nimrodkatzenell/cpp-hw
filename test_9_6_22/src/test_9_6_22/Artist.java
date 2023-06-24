package test_9_6_22;

public abstract class Artist {
	protected String name;
	protected String stageName;
	protected int age;
	protected String type;
	public Artist(String name,String stageName,int age,String type) {
		this.age=age;
		this.name=name;
		this.stageName=stageName;
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public abstract void perform();
}
