package bubble.test02;

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

    public void setLeft(boolean left){
        this.left = left;
    }

    public void setRight(boolean right){
        this.right = right;
    }

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
                    if(x < 20) break;
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
                    if(x > 980) break;
                    x += SPEED;
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
        up = true;
        setIcon(playerR);
        // 익명 클래스 - thread.start() ---> run() 메서드 안에 구문 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i< 130 / JUMP_SPEED;i++){
                    y -= JUMP_SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                down();
            }
        }).start();
    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i< 130 / JUMP_SPEED;i++){
                    y += JUMP_SPEED;
                    setLocation(x,y);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                down = false;
            }
        }).start();
    }
}
