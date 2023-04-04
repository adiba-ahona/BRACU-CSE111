public class BookDemo{
  public static void main(String[]args){
    Book book1 = new Book("Developing Java Software", "Russel Winderand", 79.75);
    System.out.println(book1);
    book1.setTitle("Pather Pachali");
    book1.setAuthor("Bibhutivushan Bandapaddhay");
    book1.setPrice(2.60);
    
    System.out.println(book1.getTitle());
    System.out.println(book1.getAuthor());
    System.out.println(book1.getPrice());
  }
}