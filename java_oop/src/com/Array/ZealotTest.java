package com.Array;

import com.startcraft_v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {
        Zealot[] zealot = new Zealot[5];
        // 반복문을 사용하지말고 질럿 3마리 0,1,3 인덱스에 넣어주 세요
        zealot[0] = new Zealot("질럿0");
        zealot[1] = new Zealot("질럿1");
        zealot[3] = new Zealot("질럿3");

        // 0번째 인덱스에 주소값을 넣어둔 질럿에 기능 showInfo()를 호출 하시오
        zealot[0].showInfo();
        zealot[1].showInfo();
        zealot[3].showInfo();

        // 반복문을 활용해서 배열안에 있는 질럿들에 showInfo()를 호출 하시오
        for (int i = 0; i < zealot.length; i++) {
            if(zealot[i] != null){
                zealot[i].showInfo();
            }
        }
    }
}
