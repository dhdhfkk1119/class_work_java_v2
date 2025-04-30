package _object;

// java.lang. * 패키지도 자동으로 넣어준다

/*
* Object 최상위 클래스 대한 이해
* 기본 적으로 Object 클래스 상속을 받는다
* 자바는 Object 클래스(모든 클래스의 최상위 클래스)를 제외 하고 
* 단일 상속만을 제공합니다
* */

public class Book{

    private int bookTypeId;
    private String title;
    private String author;

    public Book(int bookTypeId,String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    //showInfo();
//    @Override
//    public String toString() {
//        return "title" + title + ", author" + author;
//    }

    @Override
    public boolean equals(Object obj) {
        // 재정의 해 보자.
        if(obj instanceof Book) {
            // Book 타입이 맞다면 추가적으로 , 제목이 같다면 같은 책으로 판단하겠다
            if(this.title.equals(((Book)obj).title) && this.author.equals(((Book)obj).author)) {
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }


    // equals() 메서드를 재정의 할 떄는 hasCode() 메서드 재정의 해주어야
    // 의도하지 않는 동작을 막을 수 있다

    @Override
    public int hashCode() {
        return bookTypeId;
    }

    // 테스트 코드
    public static void main(String[] args) {

        // 물리적 객체 주소값은 다르지만 equals() 메서드를 재정의해서
        // 논리적으로 책 이름과 저자 이름이 같으면 같은 녀석으로 바라 보게
        // 프로그램을 만들어 주세요

        // 책제목과 그리고 저자 이름이 같다면 논리적
        Book book = new Book(1,"Java Object", "Michael Brown");
        Book book2 = new Book(1,"Java Object", "Michael Brown");
        Book book3 = new Book(2,"Java Class", "Michael black");
        Book book4 = new Book(1,"거슬러 흐르는 ", "Michael ");
        String str = new String("Java Object");

        System.out.println(book.toString());
        System.out.println(book2.toString());

        boolean result =  book.equals(book2);
        boolean result2 = book.equals(str);
        boolean result3 = book.equals(book3);
        boolean result4 = book.equals(book4);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
