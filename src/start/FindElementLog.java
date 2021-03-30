package start;

public class FindElementLog {
	public static void main() {
		
		int []a = {4,6,10,13,17,23,25,30};
		int start = 0; 
		int end = a.length-1;
		int target = 23;
		
		
		while (start <= end) {
			int mid = (start + end)/2;
			
			if(a[mid] < target) {
				start = mid + 1;
			}
			else if(a[mid] > target) {
				end = mid -1;
			}
			else {
				System.out.println("Target found at index: " + mid);
			}
		}
		
	}

}
