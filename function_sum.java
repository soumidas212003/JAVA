import java.util.*;
public class function_sum {
    public static int sumCalculate(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2=sc.nextInt();
        int sum= sumCalculate(num1,num2);
        System.out.print("Sum is : "+sum);
    }
}
