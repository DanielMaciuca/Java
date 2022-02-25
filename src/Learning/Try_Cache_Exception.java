package Learning;

public class Try_Cache_Exception {

	public static void main(String[] args) {

		try {
			String ceva[] = {"a", "b", "c"};

			System.out.println(ceva[3]);

		} catch (Exception e) {

			//e.printStackTrace();

			System.out.println("I am in the catch block");
		}

		// this code will be executed whether there was an exception or not
		finally {

				System.out.println("I am in the finally block");

		}
	}

}
