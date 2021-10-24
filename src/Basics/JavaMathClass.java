package Basics;

public class JavaMathClass {

	public static void main(String[] args) {

		System.out.println(Math.max(5, 10));

		System.out.println(Math.sqrt(64));

		System.out.println(Math.abs(-5.2));

		JavaMathClass myclass = new JavaMathClass ();

		myclass.calc(9, 11);

	}

	// make the method static to call it without object
	public void calc(int z, int q) {

		System.out.println(Math.max(z, q));  

	}

}
