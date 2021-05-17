package basicjava.basic;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		Battery33 obj = new XYZ2();
		obj.BattyType();
	}
}

interface Battery33 {
	void BattyType(); // abstract public void BattyType();
}
// 100 % 

class XYZ2 implements Battery33 {
	
	
	@Override
	public void BattyType() {
		System.out.println(" battery ");
	}
	
}