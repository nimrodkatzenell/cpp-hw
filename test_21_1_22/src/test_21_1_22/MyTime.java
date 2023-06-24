package test_21_1_22;

public class MyTime {
	private int hour;
	private int minute;
	public MyTime(int h,int m) {
		this.hour=h;
		this.minute=m;
	}
	public MyTime(MyTime t) {
		hour=t.hour;
		minute=t.minute;
	}
	public int getHour(){
		return hour;
	}
	public void setHour(int hour) {
		this.hour=hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute=minute;
	}
	
	public boolean sameTime(MyTime other) {
		if(this.hour==other.getHour() && this.minute==other.getMinute()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean before(MyTime other) {
		if(other.getHour()<this.hour) {
			return true;
		}
		else if(other.getHour() == this.hour && other.getMinute()<this.minute) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean after(MyTime other) {
		if(other.getHour()>this.hour) {
			return true;
		}
		else if(other.getHour() == this.hour && other.getMinute()>this.minute) {
			return true;
		}
		else {
			return false;
	}
	}
	public static void main(String[] args) {

		MyTime a= new MyTime(5,59);
		MyTime b= new MyTime(5,52);
		System.out.println(a.before(b));

	}

}
