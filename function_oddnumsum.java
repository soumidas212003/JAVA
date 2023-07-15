//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class function_oddnumsum {
    public static int oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        System.out.println("Sum is : "+oddSum(n));
    }
}
