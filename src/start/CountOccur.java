package start;

public class CountOccur {

    public static void main(String[] args) {
        //input arr= {1,1,2,2,2,2,3} target =2 ,output 4
         int count=0;
        int a[]={1,1,2,2,2,2,3};
        for(int i=0;i< a.length;i++){
             if (a[i]==a[i+1]){

                 count += 1;


             }
            System.out.println("count of "+a[i]+"is"+count);

        }
    }
}
