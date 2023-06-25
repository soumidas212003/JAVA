//Here we can't use "sc.next" before "sc.nextLine" . If we do, then the compiler will provide an error.
//Also show the difference between "sc.nextLine" And "sc.next".
import java.util.*;
public class Usingsc_str {
        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String a = sc.nextLine();       
        System.out.print(a);
        System.out.print("\nEnter sentence : ");
        String b = sc.next();
        System.out.print(b);
    }    
}