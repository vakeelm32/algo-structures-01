package start;



public class SumOfMinMax {

    public static void main(String[] args) {



    int a[] = {2, 4, 1, 12, 9, 30, 4};

    SumOfMinMax minMax = new SumOfMinMax();
    System.out.println(minMax.min(int a[])+ minMax.max(int a[]));


}



    public int min(int a[]) {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
            return min;
        }

        public int max( int a[]){
            int max1 = 0;
            for (int i = 0; i < a.length; i++) {

                if (a[i] > max1) {

                    max1 = a[i];
                }
                return max1;

            }


        }}}




