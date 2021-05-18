package javasectionPackageslang_java;
import java.lang.*;

 class MyObjectclass {
	public String toString()
	{
		return  "MyObjectclass";
	}
	public int hashcode()
	{
		return 100;
	}
	public boolean equals(Object o)
	{
		return this.hashcode()==o.hashCode();
	
	}
	
}
public class Objectclass
{
	public static void main(String[] args)
	{
		MyObjectclass o1=new MyObjectclass();
		MyObjectclass o2=new MyObjectclass();
		 
		System.out.println(o1.equals(o2));
	}

		
	}

