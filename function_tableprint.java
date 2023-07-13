//Make a function to print the table of a given number n
import java.util.*;
public class function_tableprint {
    public static void tablePrint(int n){
        for(int i=1;i<=10;i++){
            int c=i*n;
            System.out.println(n+"*"+i+"="+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n=sc.nextInt();
        tablePrint(n);
    }
}
