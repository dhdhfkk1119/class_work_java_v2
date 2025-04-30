package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 자바는 단일 상속만을 지원한다. Object 클래스 제외
* 이벤트 리스너 예제 코드 작성해보기
* */

// ActionListener (인터페이스) -->

public class ColorChangeFrame extends JFrame implements ActionListener {
    private JButton button;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("button1");
    }
    private void setInitLayout(){
        setLayout(new FlowLayout());
        add(button);
        setVisible(true);
    }
    private void addEventListener(){
        button.addActionListener(this); //이벤트 발생시 -> actionPerforemd 를 실행
    }

    public static void main(String[] args) {
        ColorChangeFrame frame = new ColorChangeFrame();
    }
    
    
    // 운영체제와 약속되어 있는 추상 메서드를 오버라이드 했다
    // 이벤트가 발생 되면 이 메서드를 자동으로 수행해(콜백) 미리 정해져있는
    // 정보(객체)를 받을 수 있다
    // 단, 어떤 컴포넌트가 이벤트를 실행시킬건지 먼저 등록 해줘야하 한다
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("클릭햄");
        System.out.println(e.toString());
    }
}
