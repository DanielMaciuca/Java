package Learning;

class Demo{

	//attributes

	int number;
	String name;

	//constructor
	Demo(int a, String b) {

		number = a;

		name = b;

	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		// I created an object with default values age = 10 and name = Daniel
		Demo d = new Demo(10, "Daniel");

		System.out.println(d.number + " " + d.name);


	}

}
