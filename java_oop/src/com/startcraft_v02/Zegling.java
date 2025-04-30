package com.startcraft_v02;

public class Zegling {

    private String name;
    private int hp;
    private int power;

    // 생성자
    public Zegling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
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


    // setter 는 안만들 예정


    // 저글링이 질럿을공격하다
    public void attackZelot(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + "이 "+zealot.getName()+" 을 공격합니다" );
    }


    // 저글링 마린을 공격하다
    public void attackMarine(Marine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + "이 "+marine.getName()+"을 공격합니다" );
    }

    // 내가 공격을 받다
    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println(name + "저글링 죽었습니다");
            // 실행에 제어권을 반납하고 싶으면 키워드 !! return
            return;
        }
        this.hp -= power;
        System.out.println(name + "이가 공격을 당합니다");
    }


    public void showInfo() {
        System.out.println("-----------------⭐상태창⭐---------------------");
        System.out.println("저글링 이름: " + name);
        System.out.println("저글링 피" + hp);
        System.out.println("저글링 공격력: " + power);
        System.out.println("-----------------⭐상태창⭐---------------------");
    }

}
