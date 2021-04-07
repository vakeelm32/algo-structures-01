public class Output {
    public static void main(String[] args) {

        int a[] = {2, 4, 5, 3, 8, 23, 45, 34, 21, 42, 59};
        // print the output of only 4 element in sequence,
        //{2,4,5,3},{4,5,3,8},{5,3,8,23},{3,8,23,45},{8,23,45,34},{23,45,34,21},{45,34,21,42},{34,21,42,59}
        int k = 4;

        for (int i = 0; i <= a.length - k; i++) {
            System.out.print("{");


            for(int j=i;j<i+k;j++) {



                System.out.print(a[j]+"," );
            }

            System.out.println("} " );


        }
    }
}
