package start;

public class Question1 {
	public static void main(String args[])
	{
		int[] a= new int []{2,4,1,12,9,30,4};
		int max=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(max < a[i])
			{
				max=a[i];
						
			}
		}
				
		System.out.println("Maximum number is :" +max);
	}
}
