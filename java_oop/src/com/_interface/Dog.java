package com._interface;


// 인터페이스는 구현받다 , 구현하다
// Animal 인터페이스를 구현 받다
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 달린다");
    }

    public static void main(String[] args) {
        
        // 다형성
        Animal dog = new Dog(); // 업캐스팅
        Animal bird = new Bird();

        dog.move();
        bird.move();

        dog.eat();
        bird.eat();
    }
}

class Bird implements Animal {
    
    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다");    
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 날아 다닙니다");
    }
}
