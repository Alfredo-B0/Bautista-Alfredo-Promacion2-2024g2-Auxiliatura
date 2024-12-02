import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name; 
    private List<Book> books; 

    
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    
    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price);
        addBook(newBook); // Llama al método principal addBook
    }

    
    public List<Book> getBooks() {
        return books;
    }

    
    public void displayBooks() {
        System.out.println("Author: " + name);
        for (Book book : books) {
            System.out.println("- " + book.getInfo());
        }
    }
}
