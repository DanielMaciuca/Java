package Learning;

public class MethodParameters {
	
	public static void sum(int num1, int num2) {


		num1 = num1 + 5; //se updateaza valoare lui num1
		// e deja declarat sus	

		int total = num1 + num2;

		System.out.println(total);

	}

	public static void name(String name) {

		String Customer = name;

		System.out.println(Customer);
	}

	//method with return example
	public static int Add(int a, int b) {
		return a + b;


	}

	public static void main(String[] args) {

		sum(12, 99);		

		name("Daniel");

		//calling a method with return parameters

		int addition = Add(2,4);

		System.out.println(addition);

		System.out.println(Add(6,6));



	}

}
