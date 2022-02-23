package Algorithms;

public class PrimNumber {

	public static void main(String[] args) {

		myPrime();


	}

	public static void myPrime() {

		//number to be checked

		int number = 7;

		int flag = 0;

		if (number == 0 || number == 1) {

			System.out.println("Number is not prime");
		}

		else {

			for (int i = 2; i<number/2; i++) {

				if (number%i==0) {

					System.out.println(number + " " + "Number is not prime");

					flag = 1;

					break;
				}
			}

			if (flag==0) {

				System.out.println(number + " " +  "Number is prime");
			}


		}
	}


}



