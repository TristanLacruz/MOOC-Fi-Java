
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        UserInterface userInterface = new UserInterface(scanner, first, second);

        userInterface.start();
    }
}
