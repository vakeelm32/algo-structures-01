package start;
/*class N{
int number = 5;
}
class P extends N{
int number = 10;
}
public class M {
	public static void main(String args[]){
		N a = new P();
		System.out.println(a.number);**/

class A1 {
	A1()

	{
		System.out.println("I m default constructor");
	}

	A1(int a) {
		System.out.println("Hi I am class A with int value as : " + a);
	}

	A1(String a) {
		System.out.println("Hi I am class A with string value as : " + a);
	}
}

public class M {
	public static void main(String args) {

		A1 a = new A1();
		A1 a1 = new A1("Hello");
		System.out.println("hsdfkjdsklj" );
		
	}
}
