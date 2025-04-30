package inner;

import thread.BankAccount;

public class OuterClass {
    
    private int num = 10;
    
    // inner 클래스란 클래스안에 클래스를 말한다
    // 멤버 내부 클래스
    class InnerClass {
        public void display() {
            System.out.println("inner class display() 호출 :" + num);
        }
    }

    public static void main(String[] args){
        // InnerClass innerClass = new InnerClass();
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }
}
