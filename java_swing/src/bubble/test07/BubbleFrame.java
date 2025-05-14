package bubble.test07;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;
    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();

        // 생성자 BackgroundPlayerService 안에있는 player 에 값을 넣어준다
        new Thread(new BackgroundPlayerService(player)).start();
    }

    private void initData() {
        setTitle("버블버블게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));

        //루트 패널에 JLabel 를 넣어보기
        setContentPane(backgroundMap);
        player = new Player();
    }

    private void setInitLayout() {
        setLayout(null); // 좌표기준 (absolut 레이아웃 )
        setResizable(false);
        setLocationRelativeTo(null);
        add(player);
        setVisible(true);

    }

    private void addEventListener() {
        // 프레임에 키보드 인트 리스너 등록 처리
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            // 키를 누를때 이벤트 계속 발생
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if(player.isLeft() == false && player.isLeftWallCrash() == false){
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        // 만약 플레이어가 오른쪽으로 가고 있는 상태가 아니라면 메서드를 수행해
                        // 만약 플레이어가 오른쪽으로 가고 있는 상태라면 right() 수행 하지마
                        if(player.isRight() == false && player.isRightWallCrash() == false){
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if(player.isUp() == false && player.isDown() == false){
                            player.up();
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if(player.isDown() == false && player.isDown() == false){
                            player.down();
                        }
                        break;
                    case KeyEvent.VK_SPACE:
                        add(new Bubble(player));
                        break;

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        break;

                }
            }
        });
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
