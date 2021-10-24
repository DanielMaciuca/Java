package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car newCar = new Car();

		newCar.power = 299; //Car attribute
		System.out.println(newCar.power);
		newCar.engine(); //Car method
		newCar.drive(); //Inherited method from Vehicle
		
		Motorcyle myMoto = new Motorcyle();
		
		myMoto.mirrors = 2;//Motorcycle attribute
		System.out.println(myMoto.mirrors);
		myMoto.speed();//MotorCycle class
		myMoto.drive();//Inherited method from Vehicle
			

	}

}
