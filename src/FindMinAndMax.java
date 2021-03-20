public class FindMinAndMax {

        public int max ( int a[]){
            int max = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }//if
            }//for
                return max;

            }


            public int min(int[] a) {
                int min = a[0];

                for (int i = 0; i < a.length; i++) {
                    if (a[i] < min) {
                        min = a[i];
                    }

                }
                return min;

            }



    public static void main(String[] args) {
        int a[]= {23,27,1,0,24,47};
         FindMinAndMax m= new FindMinAndMax();
        System.out.println("Maximum value in the array is::"+m.max(a));
        System.out.println("Minimum value in the array is::"+m.min(a));
    }

    }
