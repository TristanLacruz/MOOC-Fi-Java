
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // implement here your program that uses the TelevisionProgram class

    Scanner scanner = new Scanner(System.in);
    
    ArrayList<Book> books = new ArrayList<>();
    
    while(true){
      System.out.print("Title: ");
      String name = scanner.nextLine();
      if(name.isEmpty()){
        break;
      }
      System.out.print("Pages: ");
      int pages = scanner.nextInt();
      System.out.print("Publication year: ");
      int year = scanner.nextInt();
      scanner.nextLine();
      
      books.add(new Book(name, pages, year));      
    }
    System.out.println("What information will be printed?");
    String input = scanner.nextLine();
    switch(input){
      case "everything":
        for (Book index : books) {
          System.out.println(index);
        }
        break;
      case "name":
        for(int i = 0; i < books.size(); i++){
          System.out.println(books.get(i).getName());
        }
    }
  }
}

