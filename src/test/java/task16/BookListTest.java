package task16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task12.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookListTest {

    private BookList bookList;
    private Book book1 = new Book("Java Book", "Senior Programmer", 321);
    private Book book2 = new Book("Java Book", "Junior Programmer", 12);
    private Book book3 = new Book("C++ Book", "Senior Programmer", 25);
    private Book book4 = new Book("Ruby Book", "Middle Programmer", 25);
    private Book book5 = new Book("Math Book", "Not Programmer", 95);
    private Book book6 = new Book("Java Book", "Senior Programmer", 10);

    @BeforeEach
    void prepareList(){
        bookList = new BookList();
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);
        bookList.addBook(book5);
        bookList.addBook(book6);
    }

    @Test
    void titleSortTest() {
        BookList correctList = new BookList();
        correctList.addBook(book3);
        correctList.addBook(book1);
        correctList.addBook(book2);
        correctList.addBook(book6);
        correctList.addBook(book5);
        correctList.addBook(book4);
        bookList.titleSort();
        assertEquals(correctList.getBooks(), bookList.getBooks());
    }

    @Test
    void titleAuthorSortTest() {
        BookList correctList = new BookList();
        correctList.addBook(book3);
        correctList.addBook(book2);
        correctList.addBook(book1);
        correctList.addBook(book6);
        correctList.addBook(book5);
        correctList.addBook(book4);
        bookList.titleAuthorSort();
        assertEquals(correctList.getBooks(), bookList.getBooks());
    }

    @Test
    void authorTitleSortTest() {
        BookList correctList = new BookList();
        correctList.addBook(book2);
        correctList.addBook(book4);
        correctList.addBook(book5);
        correctList.addBook(book3);
        correctList.addBook(book1);
        correctList.addBook(book6);
        bookList.authorTitleSort();
        assertEquals(correctList.getBooks(), bookList.getBooks());
    }

    @Test
    void authorTitlePriceSortTest() {
        BookList correctList = new BookList();
        correctList.addBook(book2);
        correctList.addBook(book4);
        correctList.addBook(book5);
        correctList.addBook(book3);
        correctList.addBook(book6);
        correctList.addBook(book1);
        bookList.authorTitlePriceSort();
        assertEquals(correctList.getBooks(), bookList.getBooks());
    }
}