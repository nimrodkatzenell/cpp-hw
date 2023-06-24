package test_29_9_22;

public class CreditCard {
	private String creditCardNumber;
	private String name;
	private int cvv;
	private int code;
	public CreditCard(String creditCardNumber,String name,int cvv,int code) {
		this.code=code;
		this.creditCardNumber=creditCardNumber;
		this.name=name;
		this.cvv=cvv;
	}
	public int getCvv() {
		return this.cvv;
	}
	
	public boolean is3BackDigits(int cvv) {
		if(this.cvv==cvv) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean isCode(int code) {
		if(this.code==code) {
			return true;
		}
		else {
			return false;
		}
	}

}

