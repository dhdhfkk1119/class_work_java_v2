package com.inheritance;

public class HeroMainTest {

    public static void main(String[] args) {


        Warrior warrior = new Warrior();
        Archer archer = new Archer();
        Wizard wizard = new Wizard();

        warrior.attack();
        archer.attack();
        wizard.attack();

        warrior.comboAttack();
        archer.fireArrow();
        wizard.freezing();
    }
}
