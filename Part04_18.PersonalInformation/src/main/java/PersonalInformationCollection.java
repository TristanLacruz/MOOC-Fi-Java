
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String Fname = scanner.nextLine();
            if (Fname.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String Lname = scanner.nextLine();
            System.out.print("Identification number: ");
            String ident = scanner.nextLine();

            infoCollection.add(new PersonalInformation(Fname, Lname, ident));
        }
        System.out.println("");
        for (PersonalInformation e : infoCollection) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }

    }
}
