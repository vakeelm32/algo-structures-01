package javasectionPackageslang_java;

public class WrapperFloatclass {
	public static void main(String[] args)
	{
		/*float a=12.5f;
		Float b=-12.5f/0;
		System.out.println(b==Float.NEGATIVE_INFINITY);*/
		float a=12.5f;
		Float b=(float)Math.sqrt(-1);
		System.out.println(b!=Float.NaN);
	}
}
