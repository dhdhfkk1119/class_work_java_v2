package _swing;

import javax.swing.*;

public class NoLayoutEx01 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public NoLayoutEx01() {
        initDate();
        setInitLayout();
    }
    private void initDate(){
        setTitle("좌표값으로 버튼 배치하기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1 = new JButton("JButton1");
        button2 = new JButton("JButton2");
        button3 = new JButton("JButton3");

    }
    private void setInitLayout(){

        // 좌표값으로 배치(반드시 null 값을 입력하자)
        setLayout(null);

        // 좌표값을 선택하기 되면 먼저 컴포넌트에 사이즈를 결정해주어야 한다
        // setter 메서드
        button1.setSize(100,100);
        button2.setSize(100,100);
        button3.setSize(100,100);
        
        // 배치관리자가 좌표값이디 때문에 x,y값을 지정해주어야 한다
        button1.setLocation(0,0);
        button2.setLocation(250,0);
        button3.setLocation(350,0);
        add(button1);
        add(button2);
        add(button3);

    }

    public static void main(String[] args) {
        NoLayoutEx01 frame = new NoLayoutEx01();
    }
}
