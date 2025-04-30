package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyEventFrame extends JFrame implements KeyListener {

    private final int FRAME_SIZE = 500;
    private JTextArea textArea;

    public MyKeyEventFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData(){
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        textArea = new JTextArea();
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        add(textArea);
        setVisible(true);
    }

    private void addEventListener(){
        textArea.addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("위이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("아래이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("왼쪽이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("오른쪽이벤트 발생");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped : " + textArea.getText());
    }

    public static void main(String[] args) {
        MyKeyEventFrame frame = new MyKeyEventFrame();
    }
}
