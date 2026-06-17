/***
 * Task11.java
 * 
 * Task: Create a Java class to represent a Book and implements a constryctor to initialize its atrributes.
 * Instructions:
 * Create a new Java class called "Book" with the following attributes:
 * 
 * * String title
 * * String author
 * * int publicationYear
 * * double price
 * 
 * Implement a constructor in the Book class that takes four parameters corresponding to the attributes and initializes them. Create a main method in a separate
 * class to test the constructor:
 * * Instantiate three Book object with different values using the constructor.
 * * Print out the details of each book (title, author, publicationYear, price) using toString().
 * 
 * Expected Output:
 * 
 * Book 1:
 * Title: "Java Programming"
 * Author: "John Smith"
 * Publication Year: 2021
 * Price: $39.99
 * 
 * Book 2:
 * Title: "Python Basics"
 * Author: "Jane Doe"
 * Publication Year: 2020
 * Price: $29.99
 * 
 * Book 3:
 * Title: "C++ Essentials"
 * Author: "Michael Johnson"
 * Publication Year: 2019
 * Price: $49.99
 * 
 */
public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2.toString());
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3.toString());
        System.out.println();
    }
}

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double price;

    public Book(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public String toString() {
        return "Title: \"" + title + "\"\n" +
                "Author: \"" + author + "\"\n" +
                "Publication Year: " + publicationYear + "\n" +
                "Price: $" + String.format("%.2f", price);
    }
}   
