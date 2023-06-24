package test_31_10_22;

public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog("dog");
		Cat cat = new Cat("Cat");
		GoldFish goldfish = new GoldFish("gold fish");
		Thread a = new Thread(dog);
		Thread b = new Thread(cat);
		Thread c = new Thread(goldfish);
		a.start();
		b.start();
		c.start();
		
		
	}

}
