package start;

public class findMax {

	public static void main(String[]args) {
		
		int[] arr = new int[] {11,30,10,13,96,24};//creating array
		 
		int max = arr[0];//first element in array.
		
		for (int i = 0; i < arr.length; i++)  {
			
			if(arr[i] >max)  
	               max = arr[i]; 
				
			}
		
		System.out.println("Largest element in array: " + max);  
	}
}
