package _swing;

import javax.swing.*;
import java.awt.*;

/*
* 배치 관리자 - FlowLayout (컴포넌트들을 수행 , 수직으로 배치)
*
* */

public class MyComponents extends JFrame {

    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    public MyComponents() {
        initData();
        setInitLayout();
    }

    public void initData(){
        setTitle("My Components");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button = new JButton("JButton");
        label = new JLabel("글자를 뛰우는 컴포넌트");
        textField = new JTextField("아이디를 입력하세요",30);
        passwordField = new JPasswordField("비밀번호를 입력하세여 , 40");
        checkBox = new JCheckBox("동의");
    }

    public void setInitLayout(){
        // JFrame 의 배치 관리자를 결정해주는 메서드(레이아웃)
        setLayout(new FlowLayout(FlowLayout.LEFT , 30 ,30));

        // 프레임 붙이기
        add(label);
        add(textField);
        add(passwordField);
        add(checkBox);
        add(button);


    }

    public static void main(String[] args) {
        MyComponents myComponents = new MyComponents();
    }
}

