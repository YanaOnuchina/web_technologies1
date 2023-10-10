package task12;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private final Book book = new Book("Book", "Author", 15);
    private final Book book2 = new Book("Book", "Author", 17);
    private final Book book3 = new Book("Book", "Author", 15);

    @Test
    void testToString() {
        assertEquals("Book@ title: Book, author: Author, price: 15, edition: 1", book.toString());
    }

    @Test
    void testEquals() {
        assertTrue(book.equals(book));
        assertFalse(book.equals(book2));
        assertTrue(book.equals(book3));
    }

    @Test
    void testHashCode() {
        assertNotEquals(book.hashCode(), book2.hashCode());
    }
}