package HomeWork;

public class Fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myFizz();

	}


	public static void myFizz() {

		for (int i=1; i<=100;i++) {

			
			// if i%3==0 means that division remainder returns 0 (% = mod operator)
			// if the number divides with 3 or 5 will return Fizz and Buzz
			// else if the number divides with 3 will return Fizz
			// else if the number divides with 5 will return Buzz
			// else the number stored in i variable does not divide with 3&&5 or 3 or 5 will return the actaul value
			if (i%3==0 && i%5==0) {

				System.out.println("Fizz Buzz");
			}

			else if(i%3==0){

				System.out.println("Fizz");
			}

			else if(i%5==0) {

				System.out.println("Buzz");
			}
			
			else {
				
				System.out.println(i + " ");
			}
		}


	}

}
