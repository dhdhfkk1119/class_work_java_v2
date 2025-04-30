package _my_test;
import _swing.MypaintFrame;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {
    private MyPanel myPanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();
    }
    private void initData(){
        setTitle("My Paint");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }
    private void setInitLayout() {
        add(myPanel);
    }

    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawArc(870,0,100,100,0,360); // 왼쪽 동그라미
            g.drawLine(670,50,850,50); // 태양 1번쨰 선
            g.drawLine(700,200,850,100); // 태양 2번쨰 선
            g.drawLine(925,300,925,150); // 태양 3번쨰 선

            g.drawLine(200,400,600,400); // 중앙선
            g.drawLine(200,400,400,200); // 왼쪽 선
            g.drawLine(400,200,600,400); // 오른쪽 선
            g.drawRect(200,400,400,400);  // 박스모양
            g.drawRect(300,600,200,200); // 입모양
            g.drawLine(320,475,480,475); // 눈과 눈 사이

            g.drawArc(225,425,100,100,0,360); // 왼쪽 동그라미
            g.drawArc(475,425,100,100,0,360); // 오른쪽 동그라미
            g.drawString("\uD83D\uDE21",270,480); // 왼쪽 눈 이모지
            g.drawString("\uD83D\uDE21",520,480); // 왼쪽 눈 이모지
            g.drawLine(300,650,500,650); // 위에 이빨 
            g.drawLine(300,750,500,750); // 아래 이빨
        }
    }

    public static void main(String[] args) {
        MyPaintFrame myPaintFrame = new MyPaintFrame();
    }
}
