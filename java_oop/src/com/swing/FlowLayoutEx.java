package com.swing;

// GUI 화면을 만들어 보자
// 화면을 구성 할 때 배치 관리자(layout)
// button 라벨 , 텍스트 - 컴포넌트

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;

    // 생성자
    public FlowLayoutEx() {
        super.setTitle("배치 관리자 연습 - Flowlayout");
        super.setSize(500, 500);
        super.setVisible(true); // 화면에 보여주기
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 생성자 안에서 다른 메서드를 호출 할 수 있다.
        initData();
        setInitLayout();
    }

    public void initData(){
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
    }

    public void setInitLayout(){
        // 배치관리중 ---- FlowLayout, BorderLayout , .... null
        // FlowLayout --> 컴포넌트들을 (버튼) 수평 , 수직으로 배치하는 객체입니다.
        super.setLayout(new FlowLayout());
        // 버튼을 layout 에 붙여준다
        super.add(button1);
        super.add(button2);
        super.add(button3);
    }

    public static void main(String[] args) {
        FlowLayoutEx flowLayoutEx = new FlowLayoutEx();
    }
}
