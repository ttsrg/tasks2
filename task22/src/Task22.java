import java.util.Scanner;

public class Task22 {
    public static void main(String args[]) {
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("You've entered " + number);
        if (number % 10 == 7 || number % 10 == -7) System.out.println("Great, the last digital is 7");
        else System.out.println("The last digital isn't 7");

    }
}
