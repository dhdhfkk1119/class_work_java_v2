package inner;

public class SpaceshipMainTest {

    public static void main(String[] args) {
        // 멤버 내부 클래스 --> 외부 클래스가 먼저 생성이 되어야 접근 가능

        // 정적 내부 클래스 사용
        Spaceship spaceship = new Spaceship();
        spaceship.startSpaceship();

        Spaceship.Engine engine = new Spaceship.Engine();
        Spaceship.Engine 누리호1번엔진 = new Spaceship.Engine();
        spaceship.addEngine(누리호1번엔진);
        spaceship.startSpaceship();
        
        // 사용하는 이유 : 
        // [논리적인 그룹화]
        // 정적 내부 클래스는 외부 클래스와 논리적으로 관련 있는 클래스들을
        // 그룹화하는데 유용하다. 이는 코드의 가독성과 구조화 개선이며 관련 클래스들을 
        // 함께 유지할 수 있게 도움을 준다
    }
}
