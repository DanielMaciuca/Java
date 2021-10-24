package Array_ArrayList_HashMap;

import java.util.ArrayList;

public class ArrayListDemo {

	public int number;

	ArrayListDemo(){

		this.number = 5;

	}

	public static void main(String[] args) {

		//String fruits[] = {"Apple", "Orange", "Banana", "Lemon"}; 

		String fruits[] = new String[3];

		fruits[0] = "Apple";
		fruits[1] = "Orange";
		fruits[2] = "Banana";

		//System.out.println(fruits[1]);

		ArrayList<String> fruitList = new ArrayList<String>();

		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Banana");
		fruitList.add("Mango");


		//fruitList.remove("Banana");

		//fruitList.clear();

		System.out.println(fruitList.contains("Apple123"));

		//get the value by index
		System.out.println(fruitList.get(2));

		//Different from simple arrays
		/*1. You can print all the values
		 * 2. You can add/remove how many items you want,
		 * the length is not fix.
		 */

		System.out.println(fruitList);


	}

}
