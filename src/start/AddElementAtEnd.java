package start;
import java.util.Arrays;

public class AddElementAtEnd {
	public static void main(String[] args) {
	    int[] a = new int[] {1, 2, 3};
	    
	    System.out.println(Arrays.toString(a));
	    
	    a = Arrays.copyOf(a, a.length + 1); 
	   
	    a[a.length - 1] = 4;
	    System.out.println(Arrays.toString(a));
	}

}
