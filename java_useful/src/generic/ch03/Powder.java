package generic.ch03;

public class Powder extends Material{
    @Override
    public String toString() {
        return "재료는 파우더 입니다";
    }

    @Override
    public void doPrintf() {
        System.out.println("파우더를 사용해서 프린팅.... ");
    }
}
