import java.util.*;
public class function_primeornot {
    public static void primeOrNot(int num){
        boolean isprime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isprime=false;
                System.out.println("This is not a prime number");
                break;    
            }
        }
        if(isprime){
            if(num==1){
                System.out.println("This is neither prime not composite");
            } else{
                System.out.println("This is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        primeOrNot(num);
    }
}
