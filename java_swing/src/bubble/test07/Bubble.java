package bubble.test07;

import javax.swing.*;

public class Bubble extends JLabel implements Moveable {
    private int x;
    private int y;

    private boolean left;
    private boolean right;
    private boolean up;

    private Player player;

    private ImageIcon bubble; // 기본 물방울
    private ImageIcon bomb;
    private BackgroundBubbleService backgroundBubbleService;

    public Bubble(Player player) {
        this.player = player;
        this.backgroundBubbleService = new BackgroundBubbleService(this);
        initData();
        setInitLayout();
        bubbleStartThread();
    }

    private void bubbleStartThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(player.getPlayerWay() == PlayerWay.LEFT){
                    left();
                }else{
                    right();
                }
            }
        }).start();
    }

    private void initData() {
        bubble = new ImageIcon("images/bubble.png");
        bomb = new ImageIcon("images/bomb.png");
        left = false;
        right = false;
        up = false;
    }

    private void setInitLayout() {
        x = player.getX();
        y = player.getY();

        setIcon(bubble);
        setSize(50,50);
        setLocation(x,y);
    }




    // Getter
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public Player getPlayer() {
        return player;
    }

    public ImageIcon getBubble() {
        return bubble;
    }

    // Setter

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    @Override
    public void left() {
        left = true;
        for(int i = 0 ; i< 400; i ++){
            x--;
            setLocation(x,y);
            if(backgroundBubbleService.leftWall() == true){
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void right() {
        right = true;
        for(int i = 0 ; i< 400; i ++){
            x++;
            setLocation(x,y);
            if(backgroundBubbleService.rightWall() == true){
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void up() {
        up = true;
        while(up){
            y--;
            setLocation(x,y);
            if(backgroundBubbleService.upWall() == true){
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            setIcon(bomb);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(500);
            setIcon(null);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

