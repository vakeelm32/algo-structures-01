package javasection;

class Phone 
{
	public void call() {
		System.out.println("Phone call");
	}

	public void sms() {
		System.out.println("Phone sending sms");
	}

}
interface ICamera {
	void click();

	void record();
}

interface IMusicPlayer {
	void play();

	void stop();

}



class SmartPhone extends Phone implements ICamera, IMusicPlayer {
	public void VideoCall() {
		System.out.println("Smartphone video calling");
	}

	public void click() {
		System.out.println("Smartphone click photo");
	}

	public void record() {
		System.out.println("Smartphone video recording");
	}

	public void play() {
		System.out.println("Smartphone video play");
	}

	public void stop() {
		System.out.println("Smartphone video stop");
	}
}

public  class Interface_Phone_example {
public static void main(String[] args)
{
	SmartPhone sp=new SmartPhone();
	sp.play();
	sp.stop();
	sp.call();
	sp.VideoCall();
	sp.click();
	sp.record();


	
	}
}


