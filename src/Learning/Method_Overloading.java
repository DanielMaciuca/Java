package Learning;

public class Method_Overloading {
		 
	//same method with different number of arguments
	//same method with different types of arguments
	
	public static int Addition(int number1, int number2) {
		return number1 + number2;		
	}

	
	public static float Addition(float number1, float number2) {
		return number1 + number2;
		
	}
	
	public static float Addition(float x, float y, float z) {
		
		return x + y + z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = Addition(2,5);		
		System.out.println(first);
		
		float second = Addition(1.2f, 1.7f);
		System.out.println(second);
		
		float third = Addition(1.2f, 1.7f, 3.4f);
		System.out.println(third);
			
	}

}
