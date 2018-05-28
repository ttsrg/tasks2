import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        System.out.print("Enter any long phrase: ");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();

        String phrase2 = phrase.replaceAll("#", "");
        System.out.println(phrase2.replaceAll("\\?", "HELLO"));
    }

}