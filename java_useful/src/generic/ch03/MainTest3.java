package generic.ch03;

public class MainTest3 {
    public static void main(String[] args) {

        // 재료 선언해 보기
        Plastic plastic = new Plastic();
        Powder powder = new Powder();
        Water water = new Water();

        GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();


    }
}
