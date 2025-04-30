package com.asscoiation;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    
    public void showInfo(){
        System.out.println(name + "이라는 팀입니다");
    }
}
