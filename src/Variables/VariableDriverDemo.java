package Variables;

public class VariableDriverDemo {

	public static void main(String[] args) {
		
		Demo myDemo = new Demo();
		myDemo.myMethod();
		System.out.println(myDemo.x);

	}

}

class Demo{
	
	public int x = 0;
	
	public void myMethod() {
		
		x = 100;
		
		
		
	}
	
	
	
}