package com.startcraft_v03;

public abstract class Unit {

    protected String name;
    protected int hp;
    protected int power;

    public Unit() {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getPower() {
        return power;
    }

    // 마린을 질럿을공격하다
    public void attack(Unit unit) {
        unit.beAttacked(this.power);
        System.out.println(name + "이 "+unit.getName()+"을 공격합니다" );
    }


    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println(name + "유닛이 죽었습니다");
            // 실행에 제어권을 반납하고 싶으면 키워드 !! return
            return;
        }
        this.hp -= power;
        System.out.println(name + "이가 공격을 당합니다");
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Power: " + power);
    }
}
