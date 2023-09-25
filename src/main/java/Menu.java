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

        int returnedValue = StarterClass.scan.nextInt();
        //Flush from scan buffer the carriage return not consumed by nextInt
        //if not done, if in code there a nextLine, the carriage return will then be consumed
        //and program will not stop to get user input
        StarterClass.scan.nextLine();
        return Options.valueOf(returnedValue);
    }
}
