package lotto.ch02;

/*
 * SRP - 클래스를 설계할 때의 원칙중에 하나이다
 * 단일 책임에 원칙 (클래스는 가능한 단 하나의 책임을 가지는 것이 좋다)
 * */

import java.util.Arrays;
import java.util.Random;

public class LottoRandomNumber {
    static final int LOTTO_NUMBER_COUNT = 6;

    // 메서드 : 6개의 랜덤번호가 필요(중복제거, 정렬)
    public int[] randNumber() {

        // for 문이 돌아간 횟수 확인해 보기

        int[] lottoWinNum = new int[6];
        Random random = new Random();
        // random.nextInt(45) +1;
        for (int i = 0; i < lottoWinNum.length; i++) {
            lottoWinNum[i] = random.nextInt(45) + i;
            for (int j = 0; j < i; j++) {
                if (lottoWinNum[i] == lottoWinNum[j]) {
                    i--;
                }
            }
        }
        
        // 정렬 방법 ( 오름차순)
        Arrays.sort(lottoWinNum);
        return lottoWinNum;
    }

    public static void main(String[] args) {
        LottoRandomNumber number = new LottoRandomNumber();
        int[] result = number.randNumber();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
