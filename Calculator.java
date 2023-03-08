import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
  Scanner s=new Scanner(System.in);
System.out.print("Enter two numbers:");
double first=s.nextDouble();
double second=s.nextDouble();
System.out.print("Enter an operator(+,-,*,/):");
char operator=s.next().charAt(0);
double result;
switch(operator) {
    case '+':
        result=first+second;
        System.out.println(result+ "=" +first+ "+" +second);
        break;
    case '-':
        result=first-second;
        System.out.println(result+ "=" +first+ "-" +second);
        break;
    case '*':
        result=first*second;
        System.out.println(result+ "=" +first+ "*" +second);
        break;
    case '/':
        result=first/second;
        System.out.println(result+ "=" +first+ "/" +second);
        break;
    default:
        System.out.println("Error!");
       break;
}
s.close();
    }
}