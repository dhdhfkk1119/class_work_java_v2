package com.inheritance;

public class AnimalTest {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "멍멍이";
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.name = "cat";
        cat.bark();
        cat.eat();
    }

}
