package com.composition;

public class Car {
    String name;
    int price;

    // 포함 관계(컴포지션)
    // car 클래스는 Engine 객체를 포함 합니다
    Engine engine;

    public Car(){
        // 자동차 객체가 생성될 때 엔진 객체도 함께 생성 된다.
        // 강한 의존정
        engine = new Engine();
    }

    void startCar(){
        engine.start(); // car 객체를 통해 Engine 의 start 메서드를 호출한다
        System.out.println("Car started");
    }

    void stopCar(){
        System.out.println("Car stopped");
        engine.stop();
    }

    // 테스트 코드 작성
    public static void main(String[] args) {

        // 컴포지션 관계란
        // 자동차 클래스 내부에서 엔진 객체를 생성 시켜야 컴포지션 관계이다
        Car car = new Car();
        car.startCar();
        car.stopCar();

    }
}
