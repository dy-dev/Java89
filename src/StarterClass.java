import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StarterClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = AskUserForName(scan);
        System.out.println("Bonjour " + name);
    }

    private static String AskUserForName(Scanner scan) {
        System.out.println("Please enter your name");
        return scan.nextLine();
    }
}
