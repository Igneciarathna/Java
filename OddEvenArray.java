public class OddEvenArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        //enhanced for loop
        System.out.println("Even Numbers: ");
        for (int val : a) {
            if (val % 2 == 0) {
                System.out.println(val);
            }
        }
        System.out.println("Odd Numbers: ");
        for(int val:a){
            if (val%2!=0){
                System.out.println(val);
            }
        }

                //for loop
        /* System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
            System.out.println("Odd Numbers:");
            for(int i=0;i<a.length;i++){
                if(a[i]%2!=0){
                    System.out.println(a[i]);
                }
            } */
        }
    }