package start;

public class Target {
	public static void main(String[] args) {
		
		int []a = {7,5,9,12,10};
		
		
		int target = 15;
		
		for(int i=0; i< a.length; i++) {
			int element = a[i];
			int remaining = target - element;
			
			for(int j=i+1; j< a.length; j++) {
				if(remaining == a[j]) {
					System.out.println(i + " , "+ j);
					break;
				}
				
		}
		
		
				
	}
		

}
}
