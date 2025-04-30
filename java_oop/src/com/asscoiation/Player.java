package com.asscoiation;

public class Player {

    String name;
    int age;
    private Team team;


    public Player(String name) {
        this.name = name;
        team = null;
    }

    public void create(Team team) {
        this.team = team;
        System.out.println(team.getName() + "팀이 생성되었습니다");
    }

    public void showInfo() {
        if (team != null) {
            System.out.println("------------상태---------------");
            System.out.println(team.getName() + "라는 팀의 " + name + "입니다");
        }else {
            System.out.println(name + "는 현재 팀이 없습니다");
        }
    }
}
