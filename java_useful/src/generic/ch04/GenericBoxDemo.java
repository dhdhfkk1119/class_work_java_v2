package generic.ch04;

public class GenericBoxDemo {

    public static void main(String[] args) {
        // String 타입에 Box 선언 및 사용..
        Box<String> stringBox = new Box<>();
        // Integer 타입에 Box 선언 및 사용
        Box<Integer> integerBox = new Box<>();
        // double --> 래퍼클래스 ---> Double 타입에 Box 선언 및 사용
        Box<Double> doubleBox = new Box<>();

        stringBox.setBox("유리");
        System.out.println("Get" + stringBox.getBox());
        stringBox.showBox();

        integerBox.setBox(123);
        System.out.println("Get" + integerBox.getBox());
        integerBox.showBox();

        doubleBox.setBox(0.05);
        System.out.println("Get" +doubleBox.getBox());
        doubleBox.showBox();
    }

}
