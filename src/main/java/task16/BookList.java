package task16;
import task12.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public BookList(List<Book> books) {
        this.books = books;
    }

    public void titleSort(){
        books.sort(new TitleComparator());
    }

    public void titleAuthorSort(){
        books.sort(new TitleComparator().thenComparing(new AuthorComparator()));
    }

    public void authorTitleSort(){
        books.sort(new AuthorComparator().thenComparing(new TitleComparator()));
    }

    public void authorTitlePriceSort(){
        books.sort(new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator()));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
