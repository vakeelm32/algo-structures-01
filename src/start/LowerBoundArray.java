package start;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LowerBoundArray {
    public static void main(String[] args) {

        int[] a = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};

        lowerBound(a, 20);
        //  System.out.println(r);
    }

    static int lowerBound(int arr[], int x) { // x is the target value
        int r = arr.length;
        int l = 0;
        while (l >=r) {


            int mid = (l + r) / 2;

            if (arr[mid] >= x)
                r = mid;
            else {
                l = mid;
            }
            System.out.println(mid);
        }
        return r;



    }





}
