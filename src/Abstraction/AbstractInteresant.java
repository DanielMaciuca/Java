package Abstraction;

public class AbstractInteresant {

	public static void main(String[] args) {

		/*
		 * You can pass the object of subclass as argument of show function
		 *  and the reference of superclass (Phone obj) as parameter of the function
		 */

		/*This is why you are able use show function
		 *  with both Iphone and Samsung objects
		 * 
		 */

		Iphone obj1 = new Iphone();
		Samsung obj2 = new Samsung();

		show(obj1);
		show(obj2);

	}

	public static void show(Phone obj) {

		obj.showConfiguration();
	}

}

abstract class Phone{

	public abstract void showConfiguration();
}

class Iphone extends Phone{

	public void showConfiguration() {

		System.out.println("Iphone specifications");
	}
}

class Samsung extends Phone{

	public void showConfiguration() {

		System.out.println("Samsung specification");
	}
}