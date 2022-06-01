package practisebikin;

public class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString(){
        return "Book id is " + this.getBookId() + ", the name is " + this.getBookName() + " and the author is " + this.getAuthorName();

    }
}
