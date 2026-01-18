import java.util.*;
public class stringpalin {
    public static void main(String[] args){
        String s;
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        s=sc.nextLine();
        char[] rev=new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            rev[j]=s.charAt(i);
            j++;
        }
        String reverse=new String(rev);
        System.out.println("After Reverse the string.."+reverse);
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
