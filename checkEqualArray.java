package Program;

import java.util.Arrays;

public class checkEqualArray {
    public static void main(String[] args) {
        int[] a1={1,2,3,4};
        int[] a2={1,2,3,4};
        boolean array= Arrays.equals(a1,a2);
        if(array==true){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
