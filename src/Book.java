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
}
