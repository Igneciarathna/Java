package Program;

import java.util.Arrays;

public class secondLargestArray {

    public static int second(int[] a,int total){
        Arrays.sort(a);
        return a[total - 2];
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(second(a,4));
    }
}
