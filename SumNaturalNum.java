//Print the sum of First n Natual Number
import java.util.*;
public class SumNaturalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
}
