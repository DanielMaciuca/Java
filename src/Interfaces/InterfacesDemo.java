package Interfaces;

interface WaterBottleInterface{
	
	String color = "Blue";
	
	/* By default the methods from an interface are public and abstract. 
	 * You don't need to write them in clear */
	 void fillup();
	 void pourup();
	
}

class WaterBottle implements WaterBottleInterface{

	@Override
	public void fillup() {
		
		System.out.println("Bottle is filled up");
		
	}

	@Override
	public void pourup() {
		System.out.println("Water is pour out");
		
	}
	
}


public class InterfacesDemo {

	public static void main(String[] args) {

		
		WaterBottle myobject = new WaterBottle();
		
		myobject.fillup();

		
		
	}

}
