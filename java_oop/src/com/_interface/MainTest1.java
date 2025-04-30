package com._interface;

public class MainTest1 {

    public static void main(String[] args) {
        //인터페이스는 유연한 코드를 설계 할 수 있다.
        RemoteController[] remoteController = new RemoteController[3];

        remoteController[0] = new ToyRobot();
        remoteController[1] = new Refrigerator();
        remoteController[2] = new Television();

        // 인터페이스는 표준이다, 강제성이 있는 규약
        for (int i = 0; i < remoteController.length; i++) {
            remoteController[i].turnOn();
            remoteController[i].turnOff();
        }
    }

}
