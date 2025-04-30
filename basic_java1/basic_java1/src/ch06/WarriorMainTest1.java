package ch06;

public class WarriorMainTest1 {

    // 코드를 실행 하는 측
    public static void main(String[] args) {
        // 메인 지역
        // 지역 변수
        int a = 10;
        Warrior warrior1 = new Warrior();

        warrior1.name = "아마데우스";
        warrior1.health = 100;
        warrior1.power = 30;
        warrior1.dp = 10;
        warrior1.color = "빨간색";

        // w1 주소값을 화면에 갹체에 정보를 출력하자.
        System.out.println(warrior1.color);
        System.out.println(warrior1.name);

        System.out.println("--------------------");

        Warrior warrior2 = new Warrior();
        System.out.println(warrior2.dp);
        System.out.println(warrior2.power);
        System.out.println(warrior2.health);
        System.out.println(warrior2.name);


        Warrior warrior3 = new Warrior();
    }
}
