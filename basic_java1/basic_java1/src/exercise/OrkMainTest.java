package exercise;

public class OrkMainTest {
    public static void main(String[] args) {
        // Ork 객체를 생성해서 불러와줌
        Ork ork = new Ork();
        
        ork.name = "Ork1";
        ork.sex = "male";
        ork.age = 20;
        ork.health = 100;

        System.out.println("오크 이름 : " + ork.name);
        System.out.println("오크 나이 :" + ork.age);
        System.out.println("오크 성별 :" +ork.sex);
        System.out.println("오크 체력" + ork.health);
    }
}
