package Variables;

class Porto {

	// instance variable
	String name = "cica";

	public void userInfoUpdated( String b) {

		/* 1. (Name variable)This is actually the same variable as above even if it is inside a method
		/* 2. It is the same variable because it has the same name and instance variables can be accessed directly by any method from the class
		 * 3. If I put String in front of name from userInfoUpdated method will be considered a different variable
		   4. When the variable's name is highlighted with blue it means is the same
		 */

		//same variable as instance variable
		name = b;

		//String name = b; //different variable from the instance variable
		System.out.println(name);

	}


}

public class Variables {

	public static void main(String[] args) {

		Porto myobj = new Porto();

		// this will overwrite the "cici" value
		myobj.name = "Daniel";

		System.out.println(myobj.name);

		myobj.userInfoUpdated("DanielUpdated");

		System.out.println(myobj.name);

	}

}
