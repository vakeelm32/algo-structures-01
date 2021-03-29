package start;

public class Find {
	public static void  main(String[] args ) {
		
		int []a = {4,7,10,16,20,27,31};
		int target = 27;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == target) {
				System.out.println("Target found at index: " + i);
			}
		}
	}

}
