package _swing;

import javax.swing.*;
import java.awt.*;

public class BoardLayoutEx extends JFrame {

    // 멤버 변수
    JButton[] buttons;
    String[] direction = {BorderLayout.WEST, BorderLayout.EAST, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.NORTH};

    // 생성자
    public BoardLayoutEx() {
        setTitle("board layout example");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttons = new JButton[5];
        initData();
        setInitLayout();
    }

    // 메서드
    public void initData() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + i);
        }

    }

    private void setInitLayout() {
        // 배치 관리자 (보더레이아웃)
        // BoardLayout 은 컴포넌트들을 동서남북가운데 로 배치 시켜주는 레이아웃이다.
        setLayout(new BorderLayout());
        //프레임 패널
        //우리가 생성한 JButton 객체를 프레임에 붙인다

        for(int i = 0; i < buttons.length; i++) {
            add(buttons[i] , direction[i]);
        }

    }
}
