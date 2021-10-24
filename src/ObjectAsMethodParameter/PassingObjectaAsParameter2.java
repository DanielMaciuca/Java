package ObjectAsMethodParameter;

/*While creating a variable of class type, 
 * we only create a reference to an object.

When we pass this reference to a function, 
the parameters that receive it
 will refer to the same object as that referred to by the argument.
 */

class Add
{ 
	int a;
	int b;

	Add(int x,int y)// parametrized constructor 
	{
		a=x;
		b=y;
	}

	public void sum(Add object) {
		/* - Obiectul A trimis ca argument la apelarea functiei
		 *  ajunge parametru al functie
		 - Add object e doar o referinta, cand A vine ca parametru,
			referinta lui object incepe sa pointeze catre A

		- Adica avem 2 referinte care pointeaza catre acelasi obiect.

		 */

		int number = object.a + object.b;
		System.out.println(number);
	}

}

public class PassingObjectaAsParameter2 {

	public static void main(String[] args) {

		Add A=new Add(5,8);
		A.sum(A); //objectul A este argument si este trimis functie ca parametru

		System.out.println(A.a + A.b);
	}

}

