package LibraryManagement;

public final class Book {
    
    private final String author, title, genre;
    private final double price;
    
    public Book(String author, String title, String genre, double price){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }
        
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public double getPrice(){
        return this.price;
    }
}