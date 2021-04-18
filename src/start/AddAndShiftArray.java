package start;


 class AddAndShiftArray {
	

	public static void main(String[] args) {
		{
			System.out.println("before shifting");
		}
		int[] a = new int[] {1,3,10,13,11,24};
		
		
		int index = 4;
		int value = 100;
				
		
		for (int i = 0; i < a.length; i++) {
			
			 System.out.println(a[i]);
			
		}
		{
		System.out.println("after shifting");
		}	
		for( int i =a.length-1;i>=index+1;i--){
			
            a[i]=a[i-1];
		}
		 a[index]= value;
		
		        for(int i=0;i<a.length;i++){
		            System.out.println(a[i]);
		        }
		        
	}
}