import java.util.Scanner;
public class input {    
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scan = new Scanner(System.in);
        String c  = scan.next();
        System.out.println("String is: "+c);

        System.out.println("Enter a number:");
        int a  = scan.nextInt();
        System.out.println("number is: "+a);

        System.out.println("Enter a float type number:");
        float b  = scan.nextFloat();
        System.out.println("float type number is: "+b);

        System.out.println("Enter a number:");
        boolean d = scan.hasNextInt();
        System.out.println("Entered number is an integer: "+d);
    }
}
