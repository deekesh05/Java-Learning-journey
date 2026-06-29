public class Book {
    String title;
    String author;
    long isbn;
    static  int totalBooks = 0;
    static int borrowedBooks = 0;
    Book(String title,String author,long isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

        System.out.println(title + " Book is created ");
        totalBooks++;
    }
    public void borrowBook()
    {
        System.out.println(title + " is Borrowed ");
        borrowedBooks++;
    }
    public void returnBook()
    {
        System.out.println(title + " is returned");
        borrowedBooks--;

    }
    public static int getTotalBooks()
    {
        return totalBooks;
    }
    public static int getAvailableBooks()
    {
        return totalBooks-borrowedBooks;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Maths","Aditya Ranjan",123);
        Book b2 = new Book("English","Neetu",124);
        Book b3 = new Book("General Science","Khan sir" ,125);
        System.out.println("Total Books "+getTotalBooks());
        System.out.println("Available Books "+getAvailableBooks());
        b1.borrowBook();
        System.out.println("Available Books "+getAvailableBooks());
        b1.returnBook();
        System.out.println("Available Books "+getAvailableBooks());




    }

}
