package Learning;

class Student{

	int studentId;

	String name;

	Student(int studentId, String name){
		this.studentId = studentId;
		this.name = name;
	}

	/* we are overriding the original method (included in println) */
	public String toString() {
		return studentId + "" + " " +  name;


	}


}

public class toString {

	public static void main(String[] args) {

		/* toString method helps you to print an object (value of it)
		 * When you print an object it actually print it's memory location (blob)
		 * which is not very helpfull  */

		Student s = new Student (100, "John");
		Student s2 = new Student (200, "Bruce");
		
		System.out.println(s);//toString method is included in println
		
		//does exactly the same thing
		System.out.println(s2.toString());//toString method is included in println

	}

}
