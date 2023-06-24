package test_9_6_22;
import java.util.*;
public class Magazine {
	private String month;
	private ArrayList<Article> articles;
	public Magazine(String month,ArrayList<Article> articles) {
		this.month=month;
		this.articles=new ArrayList<Article>();		
	};
	public double totalCost() {
		double total=0;
		for(Article a:articles) {
			System.out.println(a.title);
			total+=a.getPrice();
		}
		return total;
	}
	public static void main(String[] args) {
		Article a = new Article("a",1000000,"b");
		Article b = new Article("a",100,"b");
		Article c = new Article("a",100,"b");
		SponsoredArticle d = new SponsoredArticle("a",100,"b","c",100);
		SponsoredArticle e = new SponsoredArticle("a",1099999990,"b","c",100);
		SponsoredArticle f = new SponsoredArticle("a",100,"b","c",100);
		SponsoredArticle g = new SponsoredArticle("a",100,"b","c",100);
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(a);
		articles.add(b);
		articles.add(c);
		articles.add(d);
		articles.add(e);
		articles.add(f);
		articles.add(g);
		Magazine m = new Magazine("a",articles);
		System.out.println(m.totalCost());
		
		
	}

}
