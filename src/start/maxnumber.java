package start;

public class maxnumber {
	public static void main(String[] args)
	{
	int[] a={4,5,6,8,3};
	int max=a[0];
	for(int i=1; i<a.length; i++)
	{
		if(max < a[i])
		{
			max=a[i];
			
		}
	}
	System.out.println("maximum number is "+max);

}

}
