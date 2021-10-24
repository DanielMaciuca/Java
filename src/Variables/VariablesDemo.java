package Variables;

class Dog{

	int age = 20;

	//method within the class
	public void Dogus(){

		age = 70;

	}
}



public class VariablesDemo {

	public static void main(String[] args) {

		//prints 20 because Dogus method is not executed
		Dog myDog = new Dog();
		System.out.println(myDog.age);

		//print 70 because Dogus method is executed and the age variable overwritten
		myDog.Dogus();
		System.out.println(myDog.age);


	}

}
