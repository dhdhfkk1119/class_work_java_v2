package com.Array;

/*
* 배열이란 연관된 데이터 타입에 요소들을 통으로 관리하기 위해 사용 한다
* */

public class IntArrayCRUD {

    public static void main(String[] args) {
        // 1. 생성 (Creat) - C
        // 배열은 반드시 크기(같이 지정해 주어야 한다)
        // 인덱스 번호를 통해서 각 요소글 찾아갈 수 있다.
        // 모든 인덱스에 번호는 0 부터 시작 된
        int[] array = new int[6];


        // 배열은 보통 반복문과 함께 많이 사용이 된다
        // 2. 조회 (Read) - R
        for (int i = 0; i < 6; i++) {
            array[i] = (i + 1) * 10;
            System.out.println(array[i]);
        }

        // 3. 수정 (Update) - U
        System.out.println("----------------------------");
        array[2] = 3;

        System.out.println(array[2]);

        // 4. 삭제 (Delete) - D
        // 배열은 고정 길이이므로 특정 인덱스를 (int 이기 때문에) 0 으로초기화 하여
        // 논리적으로 삭제했다
        array[2] = 0;
        System.out.println("삭제후 확인 : " + array[2]);
    }

}
