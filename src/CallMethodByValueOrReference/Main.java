package CallMethodByValueOrReference;

public class Main {

	public static void main(String[] args) {

		int x = 5;

		System.out.println("Value of X is " + " " + x);

		increment (x);

		System.out.println("Value of X is " + " " + x);

	}

	/*
	 * 1. This function actually received a copy of the value of x and not the original
	 * variable itself.
	 * 2. Copy means that we have 2 different variables, x and p
	 * 3. p is a local variable that exists only inside the method
	 * After the method is called it will be destroyed.
	 */

	static void increment(int p) {

		p = p + 1;


	}

}
