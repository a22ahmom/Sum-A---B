import java.util.Scanner; /* importing Scanner class */

public class SumOfAandB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); /* creating object sc of Scanner class */

        System.out.print("Enter number 1: "); /* asking user to enter number one */
        double A = sc.nextDouble(); /* taking input from user */

        System.out.print("Enter number 2: "); /* asking user to enter number two */
        double B = sc.nextDouble(); /* taking input from user */

        System.out.println("Sum of A and B is: " + Double.sum(A,B)); /* printing sum of A and B */
        sc.close(); /* closing Scanner object */
        /* End */
    }   
}