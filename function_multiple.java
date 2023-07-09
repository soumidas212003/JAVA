import java.util.*;
public class function_multiple {
    public static int productCalculate(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2=sc.nextInt();
        System.out.print("Product is : "+productCalculate(num1,num2));
    }  
}
