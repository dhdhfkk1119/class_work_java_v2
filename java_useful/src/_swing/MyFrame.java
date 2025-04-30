package _swing;

import javax.swing.*;

/*
* JLabel 이용해서 이미지를 다룰 수 있다
* JLabel.add() 메서드를 이용해서 이미지를 겹칠 수 있다
* 좌표 기준으로 배치관리자를 셋팅 하려면 null 값을 셋팅 해야 한다
* */

public class MyFrame extends JFrame {

    private JLabel background;
    private JLabel player;

    public MyFrame() {
        initData();
        setInitLayout();
    }
    private void initData(){
        setTitle("JLabel 을이용한 이미지연습");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundIcon = new ImageIcon("./images/background.png");
        ImageIcon playerIcon = new ImageIcon("./images/player.png");

        background = new JLabel(backgroundIcon);
        player = new JLabel(playerIcon);
        background.setSize(500,500);
        background.setLocation(0, 0);
        player.setSize(100,100);
        player.setLocation(0,300);

    }
    private void setInitLayout(){
        // 좌표 기반으로 셋팅이 됨 ( 주의점 - 컴포넌트에 크기 지정 , 컴포넌트(x,y지정)
        setLayout(null);
        add(player);
        add(background);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
