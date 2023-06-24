package test_21_1_22;
import java.util.*;
public class DailyTvSchedule {

	private ArrayList<TvShow> dailyTVS;
	
	public DailyTvSchedule() {
		this.dailyTVS=new ArrayList<TvShow>();
	}
	public boolean isBroadcast(MyTime cuurent){
		for(TvShow t:dailyTVS) {
			if((!t.getStartTime().before(cuurent) &&  !t.getEndTime().after(cuurent))||t.getStartTime().sameTime(cuurent)) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		DailyTvSchedule d =new DailyTvSchedule();
		TvShow tv = new TvShow("a",56,new MyTime(5,40));
		TvShow tv1 = new TvShow("a",1,new MyTime(1,50));
		TvShow tv2 = new TvShow("a",1,new MyTime(2,30));
		TvShow tv3 = new TvShow("a",50,new MyTime(5,50));

		d.dailyTVS.add(tv);
		d.dailyTVS.add(tv1);
		d.dailyTVS.add(tv2);
		d.dailyTVS.add(tv3);
		MyTime a= new MyTime(24,40);
		System.out.println(d.isBroadcast(a));
	

	}

}
