import java.util.*;
public class function_factorial {
    public static int factorial(int num){
        int count=1;
        for(int i=1;i<=num;i++){
            count*=i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.print("Factorial is : "+factorial(num));
        sc.close();
    }
}