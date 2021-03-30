package start;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckValueIfAny{

    public static int findIndex(int[]arr, int t){

       int len= arr.length;
       return IntStream.range(0,len)
               .filter(i->t==arr[i])
               .findFirst()
               .orElse(-1);
    }

    public static void main(String[] args) {
        int my_Array[]={3,5,11,14,16,23};
        System.out.println("Index position of 14:"+ findIndex(my_Array,14));

    }

    /*// using binary search
    public class index{

        public  int findIndex(int[]arr, int t){

            int index= Arrays.binarySearch(arr,t);
            return(index<0)?-1:index;


            System.out.println("Index position of 5:"+ findIndex(my_Array,14));
*/
        }



