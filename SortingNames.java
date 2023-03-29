package Program;
import java.util.Scanner;
public class SortingNames {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        n=s.nextInt();
        String[] names=new String[n];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the names");
        for(int i=0;i<n;i++) {
            names[i] = s1.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        for (String name:names) {
            System.out.println(name);
        }
    }
}
