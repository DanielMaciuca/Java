package Overriding;

// A subclass Car has the same method named honk as the parent class Vehicle
// The method is implemented different in the child class Car, to do something else

class Vehicle{

	public void drive() {
		
		System.out.println("Vehicle is driven");
	}

	public void honk() {

		System.out.println("Vehicle cand honk");

	}
}

class Car extends Vehicle {
	
public void honk() {
	
	int i = 5;
	
	for (i=0; i < 5; i++) {
	
		System.out.println("This is the method honk implemented different");
		
	}
	
}

}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Vehicle V = new Vehicle();
		
		V.honk();
		
		Car C = new Car();
		
		C.honk();

	}

}
