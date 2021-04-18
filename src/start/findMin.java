package start;

public class findMin {

	public static void main(String[]args) {
		
		int[] arr = new int[] {11,30,10,13,96,24};
		
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++)  {
			
			if(arr[i] <min)  
	               min = arr[i]; 
				
			}
		
		System.out.println("Smallest element in array: " + min);  
	}
}
