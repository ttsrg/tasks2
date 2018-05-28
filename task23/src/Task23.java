import java.util.Scanner;

public class Task23 {
    public static void main(String args[]) {
        double diagonal = 0;

        System.out.print("Enter side a: ");
        Scanner scanSideA = new Scanner(System.in);
        double sideA = scanSideA.nextDouble();

        System.out.print("Enter side b: ");
        Scanner scanSideB = new Scanner(System.in);
        double sideB = scanSideB.nextDouble();

        System.out.print("Enter radius: ");
        Scanner scanRadius = new Scanner(System.in);
        double radius = scanRadius.nextDouble();

        System.out.println("You've entered side a=" + sideA);
        System.out.println("You've entered side b=" + sideB);
        System.out.println("You've entered side radius=" + radius);

        diagonal = Math.sqrt(sideA * sideA + sideB * sideB);
        System.out.println("diagonal/2=" + diagonal / 2);

        if (diagonal / 2 <radius) System.out.println("Yes, you may cover the rectangle"); //you might use also <=
        else System.out.println("No, you can't cover the rectangle");

    }
}
