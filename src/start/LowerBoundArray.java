package start;

public class LowerBoundArray {
    public static void main(String[] args) {

        int[] a = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
        int l = 0, r = a.length;

        static int LowerBound(int arr[],int x){ // x is the target value

            while (x >= 0) {

                int mid = (l + r) / 2;

                if (a[mid] >= x)
                    r = mid;
                else l = mid;
            }
            System.out.println("lower Bound="+r);


        }

    }}