//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class Function_VoteEligiblity {
    public static void eligibleOrNot(int a){
        if(a>=18){
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("You are not eligible.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        eligibleOrNot(age);
        sc.close();
    }
}
