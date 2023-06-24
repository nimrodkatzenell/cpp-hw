package test_21_1_22;

public abstract class ElectricalP {
	protected boolean on;
	protected String name;
	public ElectricalP(String name) {
		this.name=name;
		this.on=false;
	}
	public abstract boolean onOff();
	public abstract String toString();

}
