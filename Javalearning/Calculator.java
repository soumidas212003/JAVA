/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a =sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b =sc.nextInt();
        boolean n = true;
        while(n){
            System.out.println("\n");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulo or remainder");
            System.out.println("\n");
            System.out.println("Enter your choice : ");
            int c =sc.nextInt();
            switch(c){
                case 1: 
                System.out.print("Addition is : "+(a+b)+"\n");
                break;
                case 2: 
                System.out.print("Subtraction is : "+(a-b)+"\n");
                break;
                case 3: 
                System.out.print("Multiplication is : "+(a*b)+"\n");
                break;
                case 4: 
                System.out.print("Division is : "+(a/b)+"\n");
                break;
                case 5: 
                System.out.print("Modulo or remainder is : "+(a%b)+"\n");
                break;
                default:
                n=false;
                System.out.println("Good bye !!!!");
                break;
            }
        }
        sc.close();
    }
}
