package test.cons.demo;

public class InterfaceDemo3 {

	public static void main(String[] args) {

		Iphone1 obj = new Iphone1();
		obj.BattyBrand();
		obj.mobileBrand();
		obj.mobileType();
		obj.show();

	}
}

interface Battery2 {
	void show();

	void BattyBrand();
}

interface Mobile1 {
	void mobileType();

	void mobileBrand();

	void show();
}

class Iphone1 implements Mobile1, Battery2 {

	@Override
	public void mobileType() {
		System.out.println("Iphone Mobile");
	}

	@Override
	public void mobileBrand() {
		System.out.println("Apple Brand");
	}

	@Override
	public void BattyBrand() {
		System.out.println("Battery Brand");
	}

	@Override
	public void show() {
		System.out.println("SHow Iphone");
	}

}
