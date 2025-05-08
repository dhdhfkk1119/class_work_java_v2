package generic.ch03;

/*
* 제네릭 프로그래밍을 사용하자 <T> ---> 다음 단계 <T extends Object>
*/

public class GenericPrinter<T extends Material> {
    T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 : " + material.toString();
    }
}
