package Program;
public class LCM {
    public static void main(String[] args) {
        int u=25,v=15;
        System.out.println("LCM of "+u+" and "+v+" is "+Lcm(u,v));
    }
    static int GCD(int u,int v) {
        if (u == 0)
            return v;
        return GCD(v % u, v);
    }
        static int Lcm(int u,int v){
            return(u/GCD(u,v))*v;
        }
    }

