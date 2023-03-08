import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        //using third variable
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Before Swapping");
        int a=s.nextInt();
        int b=s.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping\n"+a+ " " +b);


        //without using third variable
        /* Scanner s=new Scanner(System.in);
        System.out.println("Before swapping");
        int a=s.nextInt();
        int b=s.nextInt();
         a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping\n"+a+ " " +b);
    */
    }
}