package Variables;

class Bird {
	
	//instance variables (non static variables)
	int age;
	
	//static field (class variable)
	static int numberOfLegs = 2;
	
	public void about(int a) {
		
		//local variable
		int nextYear = a + 1;
		System.out.println("This bird is " + a + ".");
		System.out.println("This bird has" + " " + numberOfLegs + " " + "legs");
		System.out.println("Next year the bird will have" + " " + nextYear);
				
	}
	
}

public class VariablesDemoAll {

	public static void main(String[] args) {
		
		Bird Paul = new Bird();
		Paul.age = 5;	
		//Paul.about(7); you can send the value in clear, as parameter.
		//But you can also send the parameter as name.
		Paul.about(Paul.age);
		
		Bird Coco = new Bird();
		Coco.age = 10;
		Coco.about(Coco.age);
		
		
	}

}
