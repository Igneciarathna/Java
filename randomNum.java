package Program;

import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        Random rand=new Random();
        int rand_int= rand.nextInt();
        System.out.println(rand_int);
    }
}
