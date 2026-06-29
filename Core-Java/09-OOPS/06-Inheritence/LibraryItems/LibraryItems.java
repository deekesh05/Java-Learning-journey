package LibraryItems;

public class LibraryItems {
    private int itemId;
    private  String author;
    private  String title;

    public LibraryItems(int itemId, String author, String title) {
        this.itemId = itemId;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "LibraryItems{" +
                "itemId=" + itemId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
