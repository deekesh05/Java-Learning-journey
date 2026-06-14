package LibraryItems;

public class DVD extends LibraryItems{

    private int duration;

    public DVD(int itemId, String author, String title, int duration) {
        super(itemId, author, title);
        this.duration = duration;
    }
}
