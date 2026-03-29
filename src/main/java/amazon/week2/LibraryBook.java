package amazon.week2;

public class LibraryBook {

    String bookTitle;
    String bookAuthor;

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook();

        book.bookTitle = "Harry Potter";
        book.bookAuthor = "J.K. Rowling";

        System.out.println("Book Title: " + book.bookTitle);
        System.out.println("Book Author: " + book.bookAuthor);
    }




}
