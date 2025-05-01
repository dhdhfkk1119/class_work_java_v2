package _my_bubble;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;
    private ImageIcon playerR;
    private ImageIcon playerL;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 움직이는 상태
    boolean left;
    boolean right;
    boolean down;
    boolean up;

    public Player(){
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("images/playerR.png");
        playerL = new ImageIcon("images/playerL.png");
        
        // 플레이어 초기상태
        x = 55;
        y = 535;
        left = false;
        right = false;
        up = false;
        down = false;
    }


    private void setInitLayout() {
        setSize(50,50);
        setIcon(playerR);
        setLocation(x,y);

    }

    @Override
    public void left() {
        left = true; // 움직임 상태값 변경
        setIcon(playerL);
        // 익명 클래스 - thread.start() ---> run() 메서드 안에 구문 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left){
                    x -= SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void right() {
        right = true; // 움직임 상태값 변경
        setIcon(playerR);
        // 익명 클래스 - thread.start() ---> run() 메서드 안에 구문 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right){
                    x = x + SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
