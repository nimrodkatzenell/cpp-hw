package test_21_1_22;

public class TV extends ElectricalP{
	private int channel;
	
	public TV(String name, int channel) throws Exception {
		super(name);
		setChannel(channel);		
	}
	@Override
	public boolean onOff() {
		super.on=!super.on;
		return super.on;
	}
	@Override
	public String toString() {
		return super.on+" "+super.name+" "+this.channel;  
	}
	
	public void setChannel(int channel) throws Exception {
		if(channel > 99 || channel <0) {
			throw new InvalidChannel("out of bounds");
		}
		else {
			this.channel=channel;
		}
		
	}

	public static void main(String[] args) throws Exception{

		TV tv = new TV("a",9);
		System.out.println(tv.onOff());
		System.out.println(tv.onOff());

	}

}
