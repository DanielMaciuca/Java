package Basics;

public class Break {

	public static void main(String[] args) {

		myBreak();
		System.out.println("Break finished");
		myContinue();
	}

	// Breaks the loop when condition is met
	public static void myBreak() {

		for (int i=1; i<10; i++) {

			if (i==5) {

				break;
			}

			System.out.println(i);
		}

	}

	//breaks only one iteration of the loop, meaning that it will skip when i==5
	public static void myContinue() {

		for (int i=1; i< 10; i++) {

			if (i==5) {

				continue;
			}

			System.out.println(i);
		}
	}
}
