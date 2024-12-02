public class Book {
    private String title; 
    private Author author; 
    private double price; 

    
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    
    public String getInfo() {
        return "Title: " + title + ", Author: " + author.getName() + ", Price: $" + price;
    }
}
