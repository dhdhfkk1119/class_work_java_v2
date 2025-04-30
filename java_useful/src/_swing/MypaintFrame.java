package _swing;

import javax.swing.*;
import java.awt.*;

public class MypaintFrame extends JFrame {
    
    // 패널
    // private JPanel panel ; <-- 이 패널도 클래스이기 떄문에 내가 정의한 클래스에 상속을 받을 수 있음
    private myDrawPanel drawPanel;

    public MypaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("MypaintFrame");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawPanel = new myDrawPanel();
    }
    private void setInitLayout() {
        add(drawPanel);
    }
    
    // 우리가 정의할 정적 내부 클래스
    static class myDrawPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(50, 50, 100, 50);
            g.drawLine(200,100,200,350);
            g.drawLine(300,300,200,350);
            g.drawLine(200,100,200,350);
        }
    } // end of inner class

    public static void main(String[] args) {
        MypaintFrame frame = new MypaintFrame();
    }
}
