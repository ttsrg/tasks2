import java.util.Scanner;

public class Task24 {
    public static void main(String args[]) {
        System.out.print("Enter any money ) : ");
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        if (money % 100 >= 11 && money % 100 <= 14) System.out.println(money + "рублей");
        else {
            if (money % 10 == 1) System.out.println(money + "рубль");
            else {
                if (money % 10 > 0 && money % 10 < 5) System.out.println(money + "рубля");
                else System.out.println(money + "рублей");
            }
        }

    }
}
