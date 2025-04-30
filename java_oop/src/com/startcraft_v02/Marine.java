package com.startcraft_v02;

public class Marine {

    private String name;
    private int hp;
    private int power;

    // 생성자
    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
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


    // 마린이 저글링을 공격하다
    public void attackZergling(Zegling zegling) {
        zegling.beAttacked(this.power);
        System.out.println(name + "이 "+zegling.getName()+"을 공격합니다" );
    }


    // 마린을 질럿을공격하다
    public void attackZealot(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + "이 "+zealot.getName()+"을 공격합니다" );
    }

    // 내가 공격을 받다
    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println(name + "마린이 죽었습니다");
            // 실행에 제어권을 반납하고 싶으면 키워드 !! return
            return;
        }
        this.hp -= power;
        System.out.println(name + "이가 공격을 당합니다");
    }


    public void showInfo() {
        System.out.println("-----------------⭐상태창⭐---------------------");
        System.out.println("마린 이름: " + name);
        System.out.println("마린 피" + hp);
        System.out.println("마리 공격력: " + power);
        System.out.println("-----------------⭐상태창⭐---------------------");
    }
}
