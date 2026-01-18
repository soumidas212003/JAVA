//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class function_average {
    public static int numAverage(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3=sc.nextInt();
        System.out.print("Average is : "+numAverage(num1,num2,num3));
        sc.close();
    }
}
