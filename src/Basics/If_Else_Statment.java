package Basics;

public class If_Else_Statment {

	static int x = 10;

	static int y = 5;

	public static void main(String[] args) {


		if(x > y) {

			System.out.println("First Condition is true, x greater than y");

		}

		else{

			System.out.println("Second Condition is tru, y > x");

		}


		int a = 80;
		int b = 410;
		int c = 70;

		if(a > b ) {

			System.out.println(" A greater than B");
		}

		else if(a > c) {

			System.out.println("A greater than C");
		}

		else {

			System.out.println("A lower then C");

		}

	}

}
