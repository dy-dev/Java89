import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StarterClass {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Options op = menu.display();
        switch (op) {
            case EXERCISE1 -> {
                System.out.println("You selected Exo 1");
                Exercise1 ex = new Exercise1();
            }
            case EXERCISE2 -> {
                System.out.println("You selected Exo 2");
                Exercise2 ex = new Exercise2();
            }
            default -> {
                System.out.println("Pas d'options");
            }
        }
       }

}
