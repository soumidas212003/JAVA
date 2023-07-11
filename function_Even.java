import java.util.*;
public class function_Even {
    public static void evenOdd(int num){
        if(num%2==0){
            System.out.print("Even Number");
        }else{
            System.out.print("Odd Number");
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        evenOdd(num);
    }
}
