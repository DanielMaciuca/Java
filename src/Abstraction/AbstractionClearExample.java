package Abstraction;

public class AbstractionClearExample {

	public static void main(String[] args) {
		
		Concrete object = new Concrete();
		
		object.inheritance();
		
		object.implemented();
		
		object.overriding();

	}


}

abstract class ClearExample{

	public void inheritance() {

		System.out.println("This method is implemented in abstract class, it is concrete");		

	}

	public void overriding() {

		System.out.println("This method will be overwrote in the child class");

	}

	// abstract method that will be implemented
	abstract public void implemented();


}

class Concrete extends ClearExample{

	//This tag only keeps track what is implemented from the abstract class
	@Override
	public void implemented() {

		System.out.println("This is implementation");

	}

	public void overriding() {

		System.out.println("This is overriding");

	}


}