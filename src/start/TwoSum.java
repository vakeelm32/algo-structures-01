package start;
public class TwoSum {



	    public static void main (String[] args) 
	    {


	        int[] nums = { 2, 7, 11, 15 };
	        int target=9;
	        for (int i = 0; i < nums.length-1; i++){


	            if (nums[i] + nums[i+1]==target) {
	                System.out.println("Output = "+"["+i +","+(i+1)+"]");
	                break;
	            }
	            }
	        }



	    }


	
	


