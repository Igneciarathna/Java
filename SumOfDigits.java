import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num,a=0,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Digit: ");
        num=s.nextInt();
        int i=num;
        while(i>0){
            a=i%10;
            i=i/10;
            sum=sum+a;
        }
        System.out.println("Sum of Digits for "+num+ " is: "+sum);
    }
}