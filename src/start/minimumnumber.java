package start;

public class minimumnumber {
	public static void main(String[] args)
	{
	int[] a={4,5,6,8,3};
	int min=a[0];
	for(int i=1; i>a.length; i++)
	{
		if(min > a[i])
		{
			min=a[i];
			
		}
	}
	System.out.println("minimum number is "+min);

}

}
