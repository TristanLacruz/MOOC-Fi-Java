public class Book {
  
  private String name;
  private int pages;
  private int year;
  
  public Book(String name, int pages, int year){
    this.name = name;
    this.pages = pages;
    this.year = year;
  }
  
  public String getName(){
    return this.name;
  }
  
  @Override
  public String toString(){
    return name + ", " + pages + " pages, " + year;
  }
}

