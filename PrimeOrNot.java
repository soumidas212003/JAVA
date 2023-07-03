import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean isprime= true;
        for(int i=2;i<=n/2;i++){
            if(n%2==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            if(n==1){
            System.out.println("This is neither prime not composite");
            } else{
               System.out.println("This is a prime number");
            }
        }
        else{
             System.out.println("This is not a prime number");
         }
    }
}
