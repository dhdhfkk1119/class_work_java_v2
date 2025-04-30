package com.access;

public class Hero {

    private String name;
    private int hp;
    private int power;
    private double defense;
    private boolean isDie;

    //Getter 5개 만들기
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getPower(){
        return power;
    }
    public double getDefense(){
        return defense;
    }
    public boolean getIdeal(){
        return isDie;
    }

    //Setter 5개 만들기
    public void setName(String n){
        name = n;
    }
    public void setHp(int h){
        hp = h;
    }
    public void setPower(int p){
        power = p;
    }
    public void setDefense(double d){
        defense = d;
    }
    public void setIdeal(boolean i){
        isDie = i;
    }
}
