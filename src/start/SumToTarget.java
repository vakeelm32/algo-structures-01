package start;

public class SumToTarget {



    public static void main(String[] args) {


        int[] a = { 2, 7, 11, 15 };
        int target=18;
        for (int i = 0; i < a.length-1; i++){

            for(int j=0;j<=a.length-1;j++){

            if (a[i] + a[j]==target) {
                System.out.println("Output = "+"["+i +","+(j)+"]");
                break;
            }
            }
        }



    }


}