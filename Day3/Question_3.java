/*Create a Java class named Book to represent a book. The class should have the following features:

Instance Variables:

title (String): to store the title of the book.

author (String): to store the name of the author.

year (int): to store the publication year of the book.*/
public class Main {

    public static void main(String[] args) {

        //write your answer here
        Book b1 = new Book();
        System.out.println("Book 1:");
      // call displayInfo();
        b1.displayInfo();
        
        Book b2 = new Book("Java Programming", "Sakshi", 2024);
        System.out.println("Book 2:");
        // call displayInfo();
        b2.displayInfo();
    }
}    
    class Book{
        String title;
        String author;
        int year;
        public Book(){
            title = "Not specified";
            author = "Unknown";
            year = 0;
        }
        public Book(String title,String author,int year){
            this.title=title;
            this.author=author;
            this.year=year;
        }
    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
