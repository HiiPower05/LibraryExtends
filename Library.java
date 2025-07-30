import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void listBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
