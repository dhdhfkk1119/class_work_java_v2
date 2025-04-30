package _object;

public class EBook {
    
    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }
    
    // toString() 재정의

    @Override
    public String toString() {
        return title + " " + author;
    }


    // equals() 메서드 재정의

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EBook) {
            if (((EBook) obj).bookTypeId == bookTypeId && title.equals(((EBook) obj).title) && author.equals(((EBook) obj).author)) {
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }


    // hashCode() 메서드 재정의

    @Override
    public int hashCode() {
        return bookTypeId;
    }


    public static void main(String[] args) {
        EBook book = new EBook(1,"Java Object", "Michael Brown");
        EBook book2 = new EBook(2,"Java Object", "Michael Black");
        EBook book3 = new EBook(1,"Java Object", "Michael Brown");

        boolean equals = book.equals(book2);
        boolean equals2 = book.equals(book3);

        System.out.println(equals);
        System.out.println(equals2);
        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());

    }
}
