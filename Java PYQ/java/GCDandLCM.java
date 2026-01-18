import java.util.*;
public class GCDandLCM {
    public static void main(String[] args) {
        int a;
        int b;
        int gcd,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        gcd=GCD(a,b);
        System.out.println("GCD is: "+gcd);
        lcm=LCM(a,b);
        System.out.println("LCM is: "+lcm);
        sc.close();
    }
    public static int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static int LCM(int a, int b) {
    return LCMHelper(a, b, Math.max(a, b));
    }

    public static int LCMHelper(int a, int b, int current) {
        if (current % a == 0 && current % b == 0) {
            return current;
        }
        return LCMHelper(a, b, current + 1);
    }

}
