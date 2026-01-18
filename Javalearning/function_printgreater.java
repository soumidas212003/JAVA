//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class function_printgreater {
    public static void greaterPrint(int a,int b){
        if(a>b){
            System.out.println("Greater is: "+a);
        }else{
            System.out.println("Greater is: "+b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2=sc.nextInt();
        greaterPrint(num1,num2);
    }
}
