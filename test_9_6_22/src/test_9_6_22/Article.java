package test_9_6_22;

public class Article {
	protected String title;
	protected int words;
	protected String writer;
	public final static double COST =-1.85;
	public Article(String title, int words, String writer) {
		this.title=title;
		this.writer=writer;
		setWords(words);
	}
	public Article(Article other) {
	
	}
	public void setWords(int words) {
		if(words<0) {
			this.words=words*-1;
		}
		else {
			this.words=words;
		}
	}
	public double getPrice() {
		return COST*words;
	}

}
