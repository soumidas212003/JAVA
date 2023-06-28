/*
 * * * * *
 * * * * *
 * * * * *
 * * * * * 
 * * * * *
 */
import java.util.*;
public class SolidRectangle_Pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        System.out.print("Enter m value: ");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
