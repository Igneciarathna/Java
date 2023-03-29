package Program;
import java.util.Arrays;
public class SumofArrays {
    public static void main(String[] args) {
        int[] a1 = { 9999 };
        int[] a2 = { 111};
        int[] result = add(a1,a2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] add(int[] first, int[] second) {
        int length = first.length < second.length ? first.length : second.length;
        //int length = Math.min(first.length, second.length);
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }

        return result;
    }
}
