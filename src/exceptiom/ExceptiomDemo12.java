package exceptiom;

public class ExceptiomDemo12 {

	public static void main(String[] args) {

		String salary = null;
		Person1000 p = new Person1000();
		try {
			salary = p.getSalary(100);
		} catch (NumberFormatException e) {
			System.out.println("There is some problem try after some time ");
			//e.printStackTrace();
		} finally {
			System.out.println("In finally");
		}
		System.out.println(salary);

	}

}
