public class PosAndNegArray {
    public static void main(String[] args) {
        int[] a = {1, 20, 31, 14, -10, -5, -8, 3, 0};
        System.out.print("Positive Numbers in the Array is: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                System.out.print(" "+a[i]);
            }
        }
        System.out.println();
        System.out.print("Negative Numbers in the Array is: ");
for(int j=0;j<a.length;j++){
    if(a[j]<0){
        System.out.print(" "+a[j]);
    }
}
    }
}