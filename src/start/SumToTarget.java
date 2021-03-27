package start;

public class SumToTarget {



    public static void main(String[] args) {


        int[] nums = { 2, 7, 11, 15 };
        int target=18;
        for (int i = 0; i < nums.length-1; i++){

            for(int j=0;j<=nums.length-2;j++){

            if (nums[i] + nums[j+1]==target) {
                System.out.println("Output = "+"["+i +","+(j+1)+"]");
                break;
            }
            }
        }



    }


}
