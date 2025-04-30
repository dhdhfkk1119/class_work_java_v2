package com._static;

public class Card {

    static int emSerialNumber = 1; // Static 변수 : 모든 Card 객체가 공유하며 , 고유 버호를 생성하기 위해 사용할수있다
    private int cardId;
    private String cardName;


    public Card(String cardName) {
        this.cardName = cardName;
        // 클래스 변수를 활용 해보자 employeeId = Company.emSerialNumber;
        // 클래스 이름으로 접근할 수 있다
        cardId = emSerialNumber++;
    }
    public static int getTotalCards(){
        // static 메서드 안에서 인스턴스 변수를 사용 할 수 없다
        // 왜 ? 인스턴스 변수는 객체가 생성된 이후에 사용이 가능하다
//        System.out.println("cardName : " + cardName);
        return emSerialNumber;
    }

    
    // 인스턴스 메서드 만들어보자
    public void showInfo(){
        System.out.println(getTotalCards());
        System.out.println(cardName + "에 고유 번호는: " + cardId);
    }
    
    // getter
    public int getCardId() {
        return cardId;
    }


    public static void main(String[] args) {

        Card card1 = new Card("신한");
        Card card2 = new Card("우리");
        Card card3 = new Card("부산");

        System.out.println("card 1 : " + card1.getCardId());
        System.out.println("card 2 : " + card2.getCardId());
        System.out.println("card 3 : " + card3.getCardId());

    }
}
