import java.util.Scanner;

public class Menu {
    StringBuilder menuInfo;
    public Menu() {
        menuInfo = new StringBuilder("Select your option :\n");
        int i = 0;
        for (Options op :Options.values()  ) {
            menuInfo.append(op.toString()).append("\n");
        }
    }

    public Options display() {
        System.out.println(menuInfo.toString());
        Scanner scan = new Scanner(System.in);
        int returnedValue = scan.nextInt();
        return Options.valueOf(returnedValue);
    }
}
