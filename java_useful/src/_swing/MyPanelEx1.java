package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPanelEx1 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel;
    private JPanel panel2;


    public MyPanelEx1() {
        initData();
        setInitLayout();
    }

    private void initData(){
        setTitle("MyPanelEx1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        
        // 컴포넌트들을 그룹화 시킬수 있다. 즉 , 각각에 배치관리자를 추가로 설정해서 관리 할 수도 있다
        panel = new JPanel();
        panel2 = new JPanel();

        button1 = new JButton("JButton1");
        button2 = new JButton("JButton2");
        button3 = new JButton("JButton3");
        button4 = new JButton("JButton4");

    }

    private void setInitLayout(){
        setLayout(new GridLayout(2,1));

        panel.setBackground(Color.RED);
        add(panel);

        panel2.setBackground(Color.BLUE);
        add(panel2);

        // 패널 1에 버튼1을 붙여보자.
        panel.setLayout(new FlowLayout(FlowLayout.LEFT , 30 ,30));
        panel.add(button1);
        panel.add(button2);

        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT , 0 ,0));
        panel2.add(button3);
        panel2.add(button4);
        // 패널에 배치 관리자를 설정 안했음 .. (기본 배치관리자가 셋팅이 된다)
    }

    public static void main(String[] args) {
        MyPanelEx1 frame = new MyPanelEx1();
    }

}
