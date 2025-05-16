package dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 만들어주기 (매개변수)
@AllArgsConstructor // 기본 생성자 에 매개변수를 만들어줌
@ToString
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private int isbn;
    private boolean available;

}
