package Program;

public class DigitsOfCount {
    public static void main(String[] args) {
        int num=12345678;
        //int count=0;
       // while(num>0){
         //   num=num/10;
           // count++;
        int count=1;
        for(int i=count;i<=num;i++){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
