import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        //String phrase = "12345678kqweqwe12";
        System.out.print("Enter any long phrase: ");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();


        int length = phrase.length();
        String substring1 = new String(), substring2 = new String();

        System.out.println("phrase=" + phrase);

        System.out.println("length =" + length);
        System.out.println("length/2 =" + length / 2);
        System.out.println("length%2 =" + length % 2);

        substring1 = phrase.substring(0, length / 2);
        substring2 = phrase.substring(length / 2, length);

        System.out.println("substring1 =" + substring1);
        System.out.println("substring2 =" + substring2);


    }
}