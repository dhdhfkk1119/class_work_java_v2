package game;

import javax.imageio.ImageIO;
import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    BufferedImage backgroundImage;
    BufferedImage player1;
    BufferedImage player2;
    ImagePanel imagePanel;

    int x = 5;
    int y = 5;

    int playerX = 600;
    int playerY = 800;

    int playerX2 = 200;
    int playerY2 = 200;


    private boolean flag = true;

    public GameFrame() {
        initData();
        setInitLayout();
        addEventListener();
        // 메인 작업자가 서브 작업자를 생성한다
        Thread thread = new Thread(imagePanel);
        thread.start();
        // imagePanel 안에 구현한 Run() {} 메서드가 실행된다;
    }

    private void initData() {
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            backgroundImage = ImageIO.read(new File("images/background.png"));
            player1 = ImageIO.read(new File("images/player.png"));
            player2 = ImageIO.read(new File("images/player2.png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        imagePanel = new ImagePanel();
    }

    private void setInitLayout() {
        add(imagePanel);
        setVisible(true);
    }

    private void addEventListener() {

        // KeyListener <- 인터페이스야
        // 자바 문법 인터페이스 , 추상클래스를 구현 클래스(즉 객체로 사용하는 문법을 제공합니다)
        // new KeyListener() {.. 추상 메서드를 구현 메서드를 오버라이드 } (클래스로 바라본다)
        // JFrame
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(playerX == playerX2 || playerY == playerY2){
            player1 = null;
        }

//        switch (code){
//            case 1: code = KeyEvent.VK_UP;
//                playerY -= 10;
//            case 2: code = KeyEvent.VK_DOWN;
//                playerY += 10;
//            case 3: code = KeyEvent.VK_LEFT;
//                playerX -= 10;
//            case 4: code = KeyEvent.VK_RIGHT;
//                playerX += 10;
//        }

        if (code == KeyEvent.VK_UP) {
            playerY -= 10;
        }
        if (code == KeyEvent.VK_DOWN) {
            playerY += 10;
        }
        if (code == KeyEvent.VK_LEFT) {
            playerX -= 10;
        }
        if (code == KeyEvent.VK_RIGHT) {
            playerX += 10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    // 내부 클래스 생성
    private class ImagePanel extends JPanel implements Runnable{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 1000, null);
            g.drawImage(player1, playerX, playerY, 100, 100, null);
            g.drawImage(player2, playerX2, playerY2, 100, 100, null);

        }


        @Override
        public void run() {
            // direction -> true 라면 오른쪽 가고 있는 상태
            // drirection -> false 왼쪽으로 가고 있는 상태
//            boolean direction = true;
//            if(direction){
//                playerX2 -= 5;
//            }else {
//                playerX2 += 5;
//            }
            
            // 서브 작업자가 해야하는 일을 명시하도록 약속 되오 있다.
            while (flag){
                playerX2 += x;

                if(playerX2 > 900 || playerX2 < 100){
                    x = -x;
                }
                try {
                    Thread.sleep(100);
                    repaint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


}
