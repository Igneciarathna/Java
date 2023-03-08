import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //using if-else
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=s.nextInt();
        System.out.print("Enter second number: ");
        b=s.nextInt();
        System.out.print("Enter third number: ");
        c=s.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is Greater");
        }else if(b>c && b>a){
            System.out.println(b+" is Greater");
        }else {
            System.out.println(c+" is Greater");
        }
        //enhanced method
         /* int a,b,c,temp,largest;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=s.nextInt();
        System.out.print("Enter second number: ");
        b=s.nextInt();
        System.out.print("Enter third number: ");
        c=s.nextInt();
        temp=a>b?a:b;
        largest=temp>c?temp:c;
        System.out.println("Largest of "+a+","+b+","+c+ " is: " +largest);
    */
    }
}
