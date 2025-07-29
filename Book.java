public class Book {
    // below are my fields/properties which are encapsulated with keyword "private"
    private String author;
    private String title;
    private int year;

    // this is the constructor of the Book class, and it's a parameter constructor
    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    // below are getters because the fields are encapsulated. We want to call them in other classes also so we use getters
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
}
