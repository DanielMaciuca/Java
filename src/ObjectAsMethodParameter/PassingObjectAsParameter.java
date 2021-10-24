package ObjectAsMethodParameter;

class Record{

	int num;
	String name;

	public void returnObj(Record r) {

		// chiar daca am trimis obj2 ca parametru, inca nu am populat cu nimic
		System.out.println(r.num);
		
		//practic cand trimit obj2 ca parametru r devine obj2
		r.num = 100;
		r.name = "Nicusor";
		System.out.println(r.name + " " +  r.num);

	}
}

public class PassingObjectAsParameter {

	public static void main(String[] args) {

		//apelez metoda returnObj folosing obiectul obj2 ca parametru
		//in metoda r este defapt obj2 trimis ca parametru
		
		Record obj2 = new Record();
		obj2.returnObj(obj2);

	}

}
