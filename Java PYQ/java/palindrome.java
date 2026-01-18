import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int temp=n;
        while(n!=0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
        sc.close();
    }
}