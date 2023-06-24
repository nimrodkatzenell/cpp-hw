package test_31_10_22;
import java.util.*;
public class Cat extends Animal implements Runnable{

	public Cat(String name) {
		super(name);
	}
	@Override
	public void run() {
		this.makeSound();
	}
	@Override
	public void makeSound() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("meow");
		}
		System.out.println("end cat");
	}
}
