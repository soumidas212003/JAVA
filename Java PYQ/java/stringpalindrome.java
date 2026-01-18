import java.util.*;
public class stringpalindrome {
    public static void main(String[] args) {
        String s;
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        char[] rev= new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            rev[j]=s.charAt(i);
            j++;
        }
        String reverse=new String(rev);
        System.out.println("Reverse of entered String is: "+reverse);
        if(s.equals(reverse)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
        sc.close();
    }
}
