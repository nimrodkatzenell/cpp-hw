package test_31_10_22;

public class Dog extends Animal implements Runnable {
	

	public Dog(String name) {
		super(name);
	}
	
	public  void makeSound() {
		for(int i=0;i<5;i++) {
			System.out.println("Woof!");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("end dog");

	}
	
	
	public void run() {
		this.makeSound();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
