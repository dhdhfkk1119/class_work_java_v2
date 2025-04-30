package _swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    private MyImagePanel myImagePanel;
    private JPanel panel;
    private JPanel panel2;
    private JLabel label;
    private JLabel label2;


    public MyImageFrame() {
        initData();
        setInitLayout();
    }

    private void initData(){
        setTitle("이미지 넣어 보는 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);

        panel = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label = new JLabel();
        myImagePanel = new MyImagePanel();
    }

    private void setInitLayout(){
        setLayout(new GridLayout(1,2));
        add(panel);
        add(panel2);

        label.setIcon(new ImageIcon(myImagePanel.image));
        label2.setIcon(new ImageIcon(myImagePanel.image2));
        panel.add(label);
        panel2.add(label2);

    }

    // 정적 내부 클래스
    static class MyImagePanel extends JPanel {

        private Image image;
        private Image image2;
        private Image image3;

        public MyImagePanel() {
            // ImageIcon 데이터 타입을 -> .getImage() 라는 메서드를 호출해서 형 변환 - Image
            // ImageIcon(파일명) <--- 기준은 루트폴터 java_userful 아래를 확인한다
            image = new ImageIcon("image1.png").getImage();
            image2 = new ImageIcon("image2.png").getImage();
            image3 = new ImageIcon("image3.png").getImage();
        }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(image, 0, 0, 100, 100, null);
            g.drawImage(image2, 0, 0, 100, 100, null);
        }
    }

    public static void main(String[] args) {
        new MyImageFrame();
    }
}
