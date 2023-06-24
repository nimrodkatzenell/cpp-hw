package test_29_9_22;

public class Cat implements Smaller{
	private int weight;
	public Cat(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return this.weight;
	}
	
	
	@Override
	public boolean isSmaller(Smaller other) {
		Cat otherCat = (Cat) other;
		return this.getWeight()<otherCat.getWeight();
	}
	
	public static void main(String[] args) {
		Cat cat1= new Cat(1);
		Cat cat2 = new Cat(2);
		System.out.println(cat2.isSmaller(cat1));

	}

}
