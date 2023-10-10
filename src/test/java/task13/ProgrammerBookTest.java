package task13;

import org.junit.jupiter.api.Test;
import task12.Book;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerBookTest {

    private final ProgrammerBook book = new ProgrammerBook("Book", "Author", 15, "Java", 3);
    private final ProgrammerBook book2 = new ProgrammerBook("Book", "Author", 17, "Pascal", 3);
    private final ProgrammerBook book3 = new ProgrammerBook("Book", "Author", 15, "Java", 3);

    @Test
    void testToString() {
        assertEquals("ProgrammerBook@ title: Book, author: Author, price: 15, edition: 1, language: Java, level: 3", book.toString());
    }

    @Test
    void testEquals() {
        assertTrue(book.equals(book));
        assertFalse(book.equals(book2));
        assertTrue(book.equals(book3));
        Book simpleBook = new Book("Book", "Author", 15);
        assertFalse(book.equals(simpleBook));
    }

    @Test
    void testHashCode() {
        assertNotEquals(book.hashCode(), book2.hashCode());
    }

}