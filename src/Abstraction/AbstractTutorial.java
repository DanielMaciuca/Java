package Abstraction;

abstract class Dog {

	public void bark() {

		System.out.println("Dog is barking");	
	}

	//abstract method
	public abstract void run ();

	public abstract void walk ();

}

class Chiuaua extends Dog{

	//it is mandatory to override the method
	public void run() {

		System.out.println("Chiuaua can run");

	}

	//it seems that is work by only adding an empty body to the method
	@Override
	public void walk() {


	}

}

public class AbstractTutorial {

	public static void main(String[] args) {

		//Dog d = new Dog();//cannot make an instance of an abstract class

		Chiuaua c = new Chiuaua();

		c.bark(); // accessing bark method from Dog via another class Chiuaua
		c.run(); // abstract method which was implemented in Chiuaua Subclass
	}

}
