package Basics;

public class Strings {

	public static void main(String[] args) {

		/* Non primitive data type, String is a complex data type
		 * it is actually a class that can be instantiated */

		//length 

		String learn = "ala bala portocala";

		System.out.println("The length of the string is" + " " + learn.length());


		//upper case

		String up = "lower case";

		System.out.println("Upper case is" + " " + up.toUpperCase());

		String find = "ala bala portocala";

		//index of

		System.out.println("Gaseste elementul" + find.indexOf("bala"));

		//string equals

		String right = "Dacia1";

		if (right.equals("Dacia")) {

			System.out.println("This is right");

		}

		else {

			System.out.println("This is NOT right");
		}

		// toString function
		
		String string = "Dacia";
		
		//string.toString();
		
		System.out.println(string);
		
		// == operator
		
		int x = 5;
		int y = 5;

		if (x==y) {

			System.out.println("X egal cu Y");

		}

		else {

			System.out.println("X NU este egal cu Y");
		}
	}


}
