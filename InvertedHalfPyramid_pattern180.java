/*
        *
      * *
    * * *
  * * * * 
* * * * *
Inverted Half Ptramid(Rotated by 180 deg)
 */
import java.util.*;
public class InvertedHalfPyramid_pattern180 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
