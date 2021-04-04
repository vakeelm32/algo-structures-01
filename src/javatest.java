
public class javatest {
 public static void main(String[] args)
 {
 	 int arr[] = {2,4,1,12,9,30,4};
	 
	 int max = 0; 
			 for(int i=0; i< arr.length;i++)
			 {
				 if (arr[i]>max)
				 {
					 max=arr[i];
				 }
			 }
 System.out.println("max value in the array: "+max);

}
}
