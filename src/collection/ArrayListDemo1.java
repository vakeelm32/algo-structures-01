package collection;

import java.util.ArrayList;


interface A {
}

public class ArrayListDemo1 implements A {

    public static void main(String[] args) {
        int arr[] = new int[11];
        for (int i = 0; i <= 5; i++) {
            arr[i] = i;
        }

        System.out.println("array Length: " + arr.length);
        //arr[10] = 10;

        //1.space issue
        //iterate all elements to print search or retrieve
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        ArrayList<Integer> a1 = new ArrayList<Integer>(2);
        for (int i = 0; i < 5; i++) {
            a1.add(i);
        }
        a1.remove(4);

        System.out.println("arrayList size: " + a1.size());

        System.out.println("a1 : " + a1);
        System.out.println("a1 isEmpty : " + a1.isEmpty());
        System.out.println("a1 contains 3 : " + a1.contains(3));
        System.out.println("a1 contains 4 : " + a1.contains(4));

    }

}
