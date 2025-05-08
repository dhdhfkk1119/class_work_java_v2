package collections;

import java.util.HashMap;
import java.util.Map;

public class BookMapAddSystem {
    private Map<String, Book> books;

    public BookMapAddSystem(){
        books = new HashMap<>();
    }

    // 저장하는 메서드
    public void addBooks(String name , String author){
        books.put(name,new Book(name,author));
    }

    // 콘솔창에 출력하는 메서드
    public void ShowBooks(){
        for (String book : books.keySet()){
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        BookMapAddSystem book = new BookMapAddSystem();
        book.addBooks("폭삭속았수다","임상춘");
        book.ShowBooks();
    }

}
class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


}