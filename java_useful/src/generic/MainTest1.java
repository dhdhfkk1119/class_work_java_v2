package generic;

public class MainTest1 {
    public static void main(String[] args) {

        ThreeDPrint1 threeDPrint1 = new ThreeDPrint1();

        Powder powder = new Powder();
        Plastic plastic1 = new Plastic();

        threeDPrint1.setMaterial(new Plastic());


        // 위 코드의 한계는 재료가 만약 플라스틱에서 파우더로 변경해야 한다면
        // 재료가 플라스틱에 종속되어 있기 때문에 ThreePrintf2 처럼 새로운
        // 클래스를 생성하거나 코드를 수정해야하는 번거로움이 발생한다

        ThreeDPrint2 threeDPrint2 = new ThreeDPrint2();
        threeDPrint2.setMaterial(powder);

        // 데이터 타입이 다르지만 변수명을 동일하게 사용해야
        // 된다면 제네릭 프로그래밍을 사용할수 있다

        ThreeDPrint3 threeDPrint3 = new ThreeDPrint3();
        threeDPrint3.setMeterial(plastic1);
        // 재료 꺼내기
        Plastic usePlastic = (Plastic) threeDPrint3.getMeterial();
        System.out.println(usePlastic.toString());
        // 재료 교체 파우더로
        threeDPrint3.setMeterial(powder);
        System.out.println(threeDPrint3.getMeterial());
        // Object 타입으로 설계하면 모든 데이터 타입을 담을 수 있지만
        // 사용하는 측에서 매번 원시코드 확인해 가면서 불편해하는 부분이 발생할 수있다


    }
}
