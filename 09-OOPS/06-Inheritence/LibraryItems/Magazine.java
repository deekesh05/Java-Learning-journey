package LibraryItems;

public class Magazine extends LibraryItems{

   private int  issueNumber;

    public Magazine(int itemId, String author, String title, int issueNumber) {
        super(itemId, author, title);
        this.issueNumber = issueNumber;
    }
}
