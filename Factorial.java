import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = s.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+ " is: " + fact);
    }
}