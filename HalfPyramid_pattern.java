/*
 * 
 * *
 * * *
 * * * * 
 */
import java.util.*;
public class HalfPyramid_pattern {
   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
   } 
}
