//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;
public class Circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Area of circle is : "+(3.14*(r*r)));
    }
}
