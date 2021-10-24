package CallMethodByValueOrReference;

public class ReturnExample {

	public static void main(String[] args) {

		int x = 5;

		increment(x); // a copy of 

		System.out.println("Value of X is: " + " " + x);

		/* We assign the incremented value to variable b,
		 * We need to store the incremented value somewhere
		 *  */

		//x =  increment(x); This does the same thing as the following 2 lines

		int b = increment(x);

		System.out.println(b);

	}

	/* This method receives a copy of the value of x and then it increments it
	 * and returns the incremented value
	 *  */

	static int increment(int p) {

		return p + 1;

	}

}
