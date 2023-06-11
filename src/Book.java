import java.util.Objects;

public class Book {
    private String author;
    private String bookName;
    private int publishingYear;

    public Book(String author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
    public String toString() {
        return "Книга " + this.bookName + " Опубликована: "
                + this.publishingYear + " " + this.author.toString();

    }

    public boolean equals(Book book) {
        return this.bookName.equals(book.bookName) && this.author.equals(book.author)
                && this.publishingYear == book.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, publishingYear);
    }
}
