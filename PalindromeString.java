package Program;

public class PalindromeString {
    public static void main(String[] args) {
        String str="ABBA";
        String rev="";
        String org_str=str;
        int len=str.length();
        for(int i=len-1;i>=0;i--)
            rev = rev + str.charAt(i);
        if(org_str.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}
