package task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private final Book book = new Book("Book", "Author", 15);

    @Test
    void testClone() {
        Book book2 = book.clone();
        assertEquals(book2, book);
    }
}