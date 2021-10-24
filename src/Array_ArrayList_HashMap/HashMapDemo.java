package Array_ArrayList_HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		//int a = 10;
		//int b = 20;
		//int c = 30;

		/*HashMap<String, Integer> happy = new HashMap<String, Integer>();

		happy.put("a", 10);
		happy.put("b", 20);
		happy.put("c", 30);
		happy.put("d", 12);

		System.out.println(happy.get("c"));*/

		//List of users and passwords example
		HashMap<String, String> fun = new HashMap<String,String>();

		fun.put("Boby99", "fluffy!");
		fun.put("Gigi", "porto");
		fun.put("Nicu", "mona100");
		fun.put("Mihai", "mona100");
		//fun.remove("Gigi");

		System.out.println(fun);

		System.out.println(fun.replace("Mihai", "monaupdated"));
		
		System.out.println(fun);
		
	}

}
