
interface A
{
 void show ();//by default public and abstract
 
}

 interface B 
 {
	 void show ();//by default public and abstract
	 
 }
 
  class Multiple implements A, B

  {
	public void show() 
  {
System.out.println("interface a and b");
	}
	
   public static void main (String [] args)
   {
	   
	   Multiple m=new Multiple();
	   m.show();
	   }
   }