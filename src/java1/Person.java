package java1;

class Person {

	public  String name;
	public int adharNumber;

	public String getPersonDetails(String mobileNumber) {
		String str = this.name + ":" + this.adharNumber + ":" + mobileNumber;
		return str;
	}
	
}

//  private - you can access with in the same class 
//  default -  you can access with in the same package
//  protected - you can access in inheritance
// public - you can access outside the package


// class -  default, public 