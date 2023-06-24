package test_21_1_22;

public class TvShow {
private String name;
private MyTime startTime;
private int numOfMinutes;
public TvShow(String name,int numOfMinutes, MyTime start) {
	this.name=name;
	this.numOfMinutes=numOfMinutes;
	this.startTime=start;
}
public TvShow(TvShow other) {
	name=other.name;
	numOfMinutes=other.numOfMinutes;
	startTime=other.startTime;
}
public MyTime getStartTime() {
	return this.startTime;
}
public MyTime getEndTime() {
	int hour=0,minute=0;
	if(this.startTime.getMinute()+this.numOfMinutes>59) {
		hour=this.getStartTime().getHour()+(this.startTime.getMinute()+this.numOfMinutes)/60;
		minute=(this.startTime.getMinute()+this.numOfMinutes)%60;
	}
	else {
		hour=this.startTime.getHour();
		minute=this.startTime.getMinute()+this.numOfMinutes;
	}
	MyTime end = new MyTime(hour,minute);
	return end;
}
	public static void main(String[] args) {
		TvShow tv = new TvShow("a",1,new MyTime(5,50));
		System.out.println(tv.getEndTime().getHour()+" "+tv.getEndTime().getMinute());
		
	}

}
