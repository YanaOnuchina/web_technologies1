package task15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void compareToTest() {
        Book book = new Book("Book", "Author", 15, 13);
        assertEquals(0, book.compareTo(new Book("Book", "Author", 15, 13)));
        assertEquals(-1, book.compareTo(new Book("Book", "Author", 15, 14)));
        assertEquals(1, book.compareTo(new Book("Book", "Author", 15, 10)));
    }

    @Test
    void sortTest(){
        Book book1 = new Book("Book1", "Author1", 15, 13);
        Book book2 = new Book("Book2", "Author2", 17, 11);
        Book book3 = new Book("Book3", "Author3", 13, 107);
        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        Book[] sortedBooks = new Book[3];
        sortedBooks[0] = book2;
        sortedBooks[1] = book1;
        sortedBooks[2] = book3;
        Arrays.sort(books);
        assertArrayEquals(sortedBooks, books);
    }
}