package Program;

public class printRowColumn {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{1,2,3}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
        }
    }
}
