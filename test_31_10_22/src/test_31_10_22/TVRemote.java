package test_31_10_22;

public class TVRemote implements OnOffButton ,LeftRightButton{
	private int channel;
	private boolean on;
	public TVRemote(int channel,boolean on) {
		this.channel=channel;
		this.on=on;
	}
	

	
	public int left() {
		if(this.channel==1) {
			this.channel=99;
			return this.channel;
		}
		else {
			this.channel=this.channel--;
			return this.channel--;
		}
	}

	
	public int right() {
		if(this.channel==99) {
			this.channel=1;
			return this.channel;
		}
		else {
			this.channel++;
			return this.channel;
		}
	
		
	}

	
	public boolean onOff() {
		this.on=!this.on;
		return this.on;
	}
	
	
	
	public static void main(String[] args) {
		TVRemote a = new TVRemote(99,true);
		System.out.println(a.right());
		System.out.println(a.left());
		System.out.println(a.onOff());
		System.out.println(a.onOff());


	}
}
