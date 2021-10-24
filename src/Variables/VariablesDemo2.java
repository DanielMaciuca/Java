package Variables;

class Cat{

	int age;


	//Constructor
	Cat(int a){

		age = a;
		System.out.println(age);

	}
}

public class VariablesDemo2 {

	public static void main(String[] args) {

		/*message appears and value is assigned because the constructor is called when a new object is created
		 * basically we created an object initialization with a default value
		 */
		Cat myCat = new Cat(100);


		myCat.age = 200;
		System.out.println(myCat.age);


	}

}
