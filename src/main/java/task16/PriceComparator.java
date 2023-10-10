package task16;

import java.util.Comparator;
import task12.Book;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice() - (o2.getPrice());
    }
}
