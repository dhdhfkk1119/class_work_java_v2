package com.composition;

public class House {

    String address;
    Room[] rooms;

    public House(String address) {
        this.address = address;
        
        this.rooms = new Room[3]; // 컴포지션 : house 가 Room 배열을 소유하고 있다
        rooms[0] = new Room("거실");
        rooms[1] = new Room("침실");
        rooms[2] = new Room("주방");
        // 속성으로 선언되고 내부에서 객체 생성 했기 때문에  컴포지션이라고 할 수 있다
        //room = new Room("안방");

    }

    public void ShowHouse(){
        System.out.println(address + "에 있는 방 목록");
        for (int i =0;i< rooms.length;i++){
            if(rooms[i] != null){
                rooms[i].describe();
            }
        }
    }

    public static void main(String[] args) {
        House house = new House("부산시");
        house.ShowHouse();

        // houser 객체가 소멸이 되면 rooms 도 room 객체도 소멸(GC에 의해 소멸)
        house = null;

        
    }
}
