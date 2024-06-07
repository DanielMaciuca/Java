package Abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		// last try
		//Cannot make an instance(object) of an abstract class.bbbccccc
		//DanielPhone myphone = new DanielPhone();
		//myphone.call();
//inca ceva
		CelMaiDestept myphone = new CelMaiDestept();

		myphone.call();
		myphone.move();
		myphone.dance();
		myphone.cook();
//only a test
//again

	}

}

abstract class DanielPhone{

	public void call() {

		System.out.println("Calling...");
	}

	public abstract void move(); //abstract methods

	public abstract void dance();

	public abstract void cook();

}

abstract class MihaiPhone extends DanielPhone{

	/* When you extend an abstract class it is mandatory
	 * to implement the abstract methods (in the subclass).
	 * This makes overriding somehow mandatory
	 */

	// implemented move method
	@Override
	public void move() {
		System.out.println("Moving..");

	}

}

//concrete class
class CelMaiDestept extends MihaiPhone{

	// implementing dance and cook methods
	@Override
	public void dance() {
		System.out.println("Dancing...");

	}

	@Override
	public void cook() {
		System.out.println("Cooking...");

	}


}
