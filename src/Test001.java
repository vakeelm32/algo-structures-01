
public class Test001 {

	public static void main(String[] args) {

		DataHiding obj = new DataHiding();
		// obj.adharnumber =10;
		int adharnumber = obj.getAdharnumber();
		System.out.println(adharnumber);

		obj.setAdharnumber(100);
	}

}

class DataHiding {

	private int adharnumber;

	public int getAdharnumber() {
		return adharnumber-1000;
	}

	public void setAdharnumber(int adharnumber) {
		this.adharnumber = adharnumber + 200;
	}

}
