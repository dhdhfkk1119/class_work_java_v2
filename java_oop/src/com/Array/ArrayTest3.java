package com.Array;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args) {

        // 난수 발생 가능 - 랜덤한 숫자를 하나 만들어 주는 도구
        // 자바 개잘자들이 미리 만들어 준 기능
        Random rand = new Random();
        // 문서 --> 구글링 --> AI
        // 0 ~ 44 까지 랜덤한 숫자를 하나 밠행해 준다

        int[] temp = new int[6];

        for (int i = 0; i < 6; i++) {
             temp[i] = rand.nextInt(45) +1;
            System.out.println(temp[i]);
        }

    }
}
