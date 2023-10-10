package task12;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition = 1;


    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(){
        title = null;
        author = null;
        price = 0;
    }

    @Override
    public String toString(){
        String string = getClass().getSimpleName() + "@ " + "title: " + title + ", author: " + author + ", price: " +
                price + ", edition: " + edition;
        return string;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (null == obj){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        if (price != book.price){
            return false;
        }
        if (null == title) {
            if (null == author){
                return title == book.title && author == book.author;
            }
            else {
                return title == book.title && author.equals(book.author);
            }
        }
        else {
            if (null == author){
                return title.equals(book.title) && author == book.author;
            }
            else {
                return title.equals(book.title) && author.equals(book.author);
            }
        }
    }

    @Override
    public int hashCode(){
        return (int)(31 * price + 31 * edition + ((null == title) ? 0 : title.hashCode()) + ((null == author) ? 0 : author.hashCode()));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

}
