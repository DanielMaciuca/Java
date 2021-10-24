package Array_ArrayList_HashMap;

public class ArrayDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is only creating a reference because in Java arrays are objects
		//int ceva[];

		//Create an empty array with 3 positions
		
		//int number[] = new int[3]; 
		//number[0] = 1;

		//int num[] = {1,2,3}; declare and initialize

		int myArray[];
		myArray = new int[3];
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		
		int myArrayUpdated[] = {10,20,30};
		System.out.println(myArrayUpdated[1]);
		
		//============================================

		String cars[] = {"Dacia", "Ford", "Tico"};

		System.out.println(cars[0]); //index 1
		System.out.println(cars[1]); //index 2
		System.out.println(cars[2]); // index 3
		System.out.println(cars.length);

		/*You can loop through the array elements with the for loop, 
		 * and use the length property to specify how many times the loop should run.*/

		for (int i = 0; i< cars.length;i++) {

			System.out.println(cars[i]);

		}

		/*here is also a "for-each" loop, 
		 * which is used exclusively to loop through elements in an array*/

		for (String i: cars) {

			System.out.println(i);
		}

	}

}
