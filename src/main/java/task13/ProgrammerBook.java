package task13;

import task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(){
        language = null;
        level = 0;
    }

    public ProgrammerBook(String language, int level){
        super();
        this.language = language;
        this.level = level;
    }

    public ProgrammerBook(String title, String author, int price, String language, int level){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString() + ", language: " + language + ", level: " + level;
    }

    @Override
    public int hashCode(){
        return (int)(super.hashCode() + 31 * level + ((null == language) ? 0 : language.hashCode()));
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
        ProgrammerBook book = (ProgrammerBook) obj;
        if (!super.equals(book)) {
            return false;
        }
        if (level != book.level){
            return false;
        }
        if (null == language){ return (language ==
                book.language);}
        else {
            if (!language.equals(book.language)) {
                return false;
            }
        }
        return true;
    }

}
