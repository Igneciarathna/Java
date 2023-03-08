public class SumofNaturalNumbers {
    public static void main(String[] args) {
   //formula
        int n = 10;
        System.out.print(naturalNumSum(n));
    }
    //function
    static int naturalNumSum(int n) {
        return n*(n+1)/2;
    }
    }
        /* int n = 10;
        System.out.print(naturalNumSum(n));
    }
    //function
    static int naturalNumSum(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
            return sum;
        }
         */

        //for loop
      /* int num = 10, i = 1, sum = 0;
       for(i=1;i<=num;i++){
          sum=sum+i;
      }
        System.out.println(sum);
    */

        //while loop
        /*
         int num = 10, i = 1, sum = 0;
         while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
         */