public class Main {
    public static void main(String[] args) {
       
        Author author = new Author("J.K. Rowling");

        
        author.addBook(new Book("Harry Potter and the Philosopher's Stone", author, 19.99));
        author.addBook("Harry Potter and the Chamber of Secrets", 21.99);

        
        author.displayBooks();
    }
}
