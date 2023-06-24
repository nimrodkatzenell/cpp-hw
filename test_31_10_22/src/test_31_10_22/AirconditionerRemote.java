package test_31_10_22;

public class AirconditionerRemote implements UpDownButton , OnOffButton{
	private boolean on;
	private int temp;
	public AirconditionerRemote(boolean on, int temp) {
		this.on=on;
		this.temp=temp;
	}
	

	
	public int up() {
		if(this.temp>=30) {
			this.temp=30;
			return this.temp;
		}
		else {
			this.temp++;
			return this.temp;
		}
		
	}

	
	public int ddown() {
		if(this.temp<=16) {
			this.temp=16;
			return this.temp;
		}
		else {
			this.temp--;
			return this.temp;
		}
	}
	
	
	public boolean onOff() {
		this.on=!this.on;
		return this.on;
	}
	
	public static void main(String[] args) {
		AirconditionerRemote a = new AirconditionerRemote(true, 16);
		System.out.println(a.ddown());
		System.out.println(a.up());
		System.out.println(a.onOff());
	
	}

	

}
