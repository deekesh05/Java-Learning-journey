package LibraryItems;

public class Book extends LibraryItems{
    private int isbn;

    public Book(int itemId, String author, String title, int isbn) {
        super(itemId, author, title);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                "isbn=" + isbn +
                '}';
    }
}
