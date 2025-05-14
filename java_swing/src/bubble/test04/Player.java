package bubble.test04;

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

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMP_SPEED() {
        return JUMP_SPEED;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isLeftWallCrash() {
        return leftWallCrash;
    }

    public boolean isRightWallCrash() {
        return rightWallCrash;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setLeftWallCrash(boolean leftWallCrash) {
        this.leftWallCrash = leftWallCrash;
    }

    public void setRightWallCrash(boolean rightWallCrash) {
        this.rightWallCrash = rightWallCrash;
    }

    public Player() {
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
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);

    }

    @Override
    public void left() {
        left = true; // 움직임 상태값 변경
        setIcon(playerL);
        // 익명 클래스 - thread.start() ---> run() 메서드 안에 구문 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    x -= SPEED;
                    if (x < 20) break;
                    setLocation(x, y);
                    try {
                        Thread.sleep(20);
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
                while (right) {
                    if (x > 980) break;
                    x += SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(20);
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
                for (int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y -= JUMP_SPEED;
                    setLocation(x, y);
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
                for (int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y += JUMP_SPEED;
                    setLocation(x, y);
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
