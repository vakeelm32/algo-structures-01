package interfaces;

class Phone {
	public void call() {
		System.out.println("Phone Call");
	}

	public void sms() {
		System.out.println("Phone sending SMS");
	}
}

interface ICamera {
	void click();

	void stop();
}

interface IMusicPlayer {
	void play();

	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
	public void videocall() {
		System.out.println("Smart Phone videocalling");
	}

	public void click() {
		System.out.println("Smart Phone clicking");
	}

	public void record() {
		System.out.println("Smart Phone recording");
	}

	public void play() {
		System.out.println("Smart Phone playing");
	}

	public void stop() {
		System.out.println("Smart Phone stoping");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.play();
	}

}
