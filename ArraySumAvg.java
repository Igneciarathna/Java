package Program;

public class ArraySumAvg {
    public static void main(String[] args) {
        int[] a={2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum=0;
        double avg;
        for(int i:a){
            sum=sum+i;
        }
        int n=a.length;
        avg=((double)sum/(double)n);
        System.out.println(sum);
        System.out.println(avg);
    }
}
