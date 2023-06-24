package test_31_10_22;

public class GoldFish extends Animal implements Runnable{

	public GoldFish(String name) {
		super(name);
	}

	public void run() {
		this.makeSound();
	}

	
	public void makeSound() {
	
		for(int i=0;i<3;i++) {
			System.out.println("bloop");
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end gold fish");
	}

}
