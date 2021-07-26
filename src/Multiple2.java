
interface A1
{
 void show ();//by default public and abstract
 
}

 interface B1 
 {
	 void Disp ();//by default public and abstract
	 
 }
 
  class Multiple2 implements A1, B1

  {
	public void show() 
  {
System.out.println("interface a");
	}
	
	public void Disp() 
	  {
	System.out.println("interface b");
		}
		
	
   public static void main (String [] args)
   {
	   
	   Multiple m=new Multiple();
	   m.show();
	    
	   }
   }