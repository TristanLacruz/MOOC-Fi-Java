
import java.util.Scanner;


/**
 *
 * @author trist
 */
public class UserInterface {
    
    private Scanner scanner;
    private BirdsDatabase birdsDatabase;
    
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        birdsDatabase = new BirdsDatabase();
    }
    
    public void start(){
        boolean running = true;
        while (running) {
            System.out.print("? ");
            String option = scanner.nextLine();
            switch(option){
                case "Add":
                    System.out.print("Name: ");
                    String englishName = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    Bird bird = new Bird(englishName, latinName);
                    birdsDatabase.add(bird);
                    break;
                case "Observation":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    if(!birdsDatabase.addObervation(name)){
                        System.out.println("Not a bird!");
                    }
                    break;
                case "All": 
                    birdsDatabase.printBirds();
                    break;
                case "One":
                    System.out.print("Bird: ");
                    String singleName = scanner.nextLine();
                    birdsDatabase.printSingleBird(singleName);
                    break;
                case "Quit":
                    running = false;
                    break;
            }
        }
    }
}
