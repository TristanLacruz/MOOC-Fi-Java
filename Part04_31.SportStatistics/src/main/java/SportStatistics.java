
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try {
            System.out.println("Games: " + knowGames(file, team));
            System.out.println("Wins: " + knowVictories(file, team));
            System.out.println("Losses: " + knowLosses(file, team));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static int knowGames(String file, String team) throws IOException {
        Scanner scanner = new Scanner(Paths.get(file));
        String line;
        int cont = 0;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] parts = line.split(",");
            if ((parts[0].equals(team)) || (parts[1].equals(team))) {
                cont++;
            }
        }
        return cont;
    }

    public static int knowVictories(String file, String team) throws IOException {
        Scanner scanner = new Scanner(Paths.get(file));
        String line;
        int cont = 0;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] parts = line.split(",");
            if (parts[0].equals(team)) {
                if (Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
                    cont++;
                }
            }
            if (parts[1].equals(team)) {
                if (Integer.parseInt(parts[3]) > Integer.parseInt(parts[2])) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int knowLosses(String file, String team) throws IOException {
        Scanner scanner = new Scanner(Paths.get(file));
        String line;
        int cont = 0;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] parts = line.split(",");
            if (parts[0].equals(team)) {
                if (Integer.parseInt(parts[2]) < Integer.parseInt(parts[3])) {
                    cont++;
                }
            }
            if (parts[1].equals(team)) {
                if (Integer.parseInt(parts[3]) < Integer.parseInt(parts[2])) {
                    cont++;
                }
            }
        }
        return cont;
    }

}
