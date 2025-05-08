package copy;

public class MainTest1 {

    // Stack 메모리 곳에서 할당
    public static void main(String[] args) {
        // 얕은 복사(Shallow Copy), 깊은 복사(Deep Copy)
        // 기본 데이터 타입(소문자), 참조 타입(대문자)

        int a = 10;
        int b = a; // 기본 데이터 타입은 값 복사
        b = 100;
        // person1 --> 참조 변수 (변수안에 담기는 값은 --> heap 객체 안에 주소값에 값이 들어감)
        Person person1 = new Person("홍길동");
        Person person2 = person1; // 주소 값 복사가 된다 --> 얕은 복사라고 한다 (Sallow Copy)
        // 즉 , person1 , person2 는 같은 객체를 바라보고 있기 때문에
        person2.name = "티모";
        System.out.println(person1.name);

    }
    
}
class Person{
    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
