import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this is the object containing attributes such as author name and title

        Library myLibrary = new Library();

        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925);
        Book book2 = new Book("Hiromu Arakawa", "Fullmetal Alchemist", 2001);

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        myLibrary.listBooks();

        Scanner sc = new Scanner(System.in);

        String [] options = {"1. List All Books", "2. Add Book", "3. Exit", "4. Remove Book - IN PROGRESS"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Choose an option:",
                "Library Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]
        );

        switch (choice) {
            case 1:
                myLibrary.listBooks();
                break;
            case 2:
                JOptionPane.showInputDialog(null, "Enter Author Name: ");
                String author = sc.nextLine();
                JOptionPane.showInputDialog(null, "Enter Book Title: ");
                String title = sc.nextLine();
                JOptionPane.showInputDialog(null, "Enter Book Year: ");
                int year = sc.nextInt();

                Book newBook = new Book(author, title, year);
                myLibrary.addBook(newBook);
                System.out.println("Book Added!");
                break;
            case 3:
                System.out.println("GoodBye! Enjoy Reading");
                break;
            case 4:
                System.out.println("IN PROGRESS");
                break;
            default:
                System.out.println("Invalid Option.");
        }
        sc.close();
        }
    }
