package java1;

public class ClassObjectDemo2 {

	public static void main(String[] args) {

		Person p = new Person();

		p.adharNumber = 1234567890;
		p.name = "Imran";

		//System.out.println(p.name);
		//System.out.println(p.adharNumber);

		String result = p.getPersonDetails("9833523511");
		System.out.println(result);

		Person p2 = new Person();

		p2.adharNumber = 992328383;
		p2.name = "Aftab";

		String result2 = p2.getPersonDetails("9833523511");
		System.out.println(result2);

	}
}
