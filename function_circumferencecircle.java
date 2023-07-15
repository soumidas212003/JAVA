//Write a function that takes in the radius as input and returns the circumference of a circle
import java.util.*;
public class function_circumferencecircle {
    public static double circumferenceCircle(double r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius value: ");
        double r=sc.nextDouble();
        System.out.println("Circumference of a circle is: "+circumferenceCircle(r));
    }
}
