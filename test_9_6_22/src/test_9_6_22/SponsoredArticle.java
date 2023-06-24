package test_9_6_22;

public class SponsoredArticle extends Article{
private String funder;
private double funding;
public SponsoredArticle(String title, int words, String writer,String funder,double funding) {
	super(title, words, writer);
	this.funder=funder;
	setFunding(funding);
}

public SponsoredArticle(SponsoredArticle other) {
	super(other.title,other.words,other.writer);
	funder= other.funder;
	funding=other.funding;
}
public void setFunding(double funding) {
	if(funding<0) {
		this.funding=0;
	}
	else {
		this.funding=funding;
	}
}
	
@Override
public double getPrice() {
	return super.getPrice()+funding;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
