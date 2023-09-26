import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StarterClass {
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Menu menu = new Menu();
        Options op = menu.display();
        switch (op) {
            case EXO1_STUDENTS -> {
                System.out.println("You selected Exo 1");
                Exo1Students ex = new Exo1Students();
            }
            case EXO2_ARRAYS -> {
                System.out.println("You selected Exo 2");
                Exo2ArrayManipulation ex = new Exo2ArrayManipulation();
            }
            case EXO3_PRIME -> {
                System.out.println("You selected Exo 3");
                Exo3PrimeNumbers ex = new Exo3PrimeNumbers();
            }
            default -> {
                System.out.println("Pas d'options");
            }
        }
       }

}
