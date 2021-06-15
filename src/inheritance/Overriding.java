package inheritance;

class TV {
	public void switchOn() {
		System.out.println("TV is switched on");
	}

	public void changeChannel() {
		System.out.println("TV channel is changed");
	}
}

class SmartTV extends TV {
	public void switchOn() {
		System.out.println("SmartTV is switched on");
	}

	public void changeChannel() {
		System.out.println("SmartTV channel is changed");
	}

	public void browse() {
		System.out.println("SmartTV browsing");
	}

}

public class Overriding {
	public static void main(String[] args) {
		TV t = new SmartTV();
		t.changeChannel();
		t.browse();
		t.switchOn();
		//t.browse();
		
		
	}

}
