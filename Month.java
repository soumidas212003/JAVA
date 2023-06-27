import java.util.*;
public class Month {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean n =true;
        while(n){
            System.out.println("\n");
            System.out.println("Enter 1 to print January!");
            System.out.println("Enter 2 to print February!");
            System.out.println("Enter 3 to print March!");
            System.out.println("Enter 4 to print April!");
            System.out.println("Enter 5 to print May!");
            System.out.println("Enter 6 to print June!");
            System.out.println("Enter 7 to print July!");
            System.out.println("Enter 8 to print August!");
            System.out.println("Enter 9 to print September!");
            System.out.println("Enter 10 to print October!");
            System.out.println("Enter 11 to print November!");
            System.out.println("Enter 12 to print December!");
            System.out.println("\n");
            System.out.println("Enter your choice !!!!!");
            int month=sc.nextInt();
            switch(month){
                case 1:
                System.out.println("January!");
                break;
                case 2:
                System.out.println("February!");
                break;
                case 3:
                System.out.println("March!");
                break;
                case 4:
                System.out.println("April!");
                break;
                case 5:
                System.out.println("May!");
                break;
                case 6:
                System.out.println("June!");
                break;
                case 7:
                System.out.println("July!");
                break;
                case 8:
                System.out.println("August!");
                break;
                case 9:
                System.out.println("September!");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November!");
                break;
                case 12:
                System.out.println("December!");
                break;
                default:
                n=false;
                System.out.println("Wrong Input!!!!!!");
            }
        }
    }
}
