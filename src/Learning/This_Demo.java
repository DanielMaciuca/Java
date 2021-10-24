package Learning;

public class This_Demo {

	String name;
	char size;
	int age;

	public void SetData(String name, char size, int age) {

		/* If I don't have this keyword java get confused between
		 * 'name' instance variable and 'name' SetData function parameter
		 * and it will assign null */
		this.name = name;
		this.size = size;
		this.age = age;

	}
	
	public static void main(String[] args) {

		This_Demo food = new This_Demo();
		food.SetData("mancare",'L', 36);
		System.out.println(food.name + " " + food.size + " " + food.age); 


	}

}
