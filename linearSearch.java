public class linearSearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int key=4;
        System.out.print(linearSearch1(a,key));
    }
    public static int linearSearch1(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}