package LibraryManagement;

public class Book {
    
    private String author, title, genre;
    private double price;
    
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
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    
}
