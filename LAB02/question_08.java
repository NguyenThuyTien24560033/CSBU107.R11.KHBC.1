import java.util.ArrayList;
import java.util.List;

public class question_08 {
    static class Book {
        private String title;
        private double price;

        public Book(String title, double price) {
            this.title = title;
            this.price = (price > 0) ? price : 0.0;
        }

        public void displayBookInfo() {
            System.out.printf("   - Book: %-40s | Price: $%.2f%n", this.title, this.price);
        }
    }

    static class Author {
        private String name;
        private String email;
        private List<Book> books;

        public Author(String name, String email) {
            this.name = name;
            this.email = email;
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            if (book != null) {
                this.books.add(book);
            }
        }

        public void displayInfo() {
            System.out.println("");
            System.out.println("Author: " + this.name + " | Email: " + this.email);
            System.out.println("Published Books (" + this.books.size() + " books):");
            if (this.books.isEmpty()) {
                System.out.println("   (No books added yet)");
            } else {
                for (Book b : this.books) {
                    b.displayBookInfo();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("            AUTHOR AND BOOK              ");

        Author author1 = new Author("J.K. Rowling", "jkrowling@gmail.com");
        author1.addBook(new Book("Harry Potter and the Sorcerer's Stone", 19.99));
        author1.addBook(new Book("Harry Potter and the Chamber of Secrets", 21.50));

        Author author2 = new Author("Nguyen Nhat Anh", "nna@gmail.com");
        author2.addBook(new Book("Give Me a Ticket to Childhood", 8.50));
        author2.addBook(new Book("Dreamy Eyes", 10.00));

        Author author3 = new Author("New Author", "newauthor@gmail.com");


        author1.displayInfo();
        author2.displayInfo();
        author3.displayInfo();
    }
}