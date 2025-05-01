package bubble.test01;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;
    private ImageIcon playerR;
    private ImageIcon playerL;
    
    public Player(){
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("images/playerR.png");
        playerL = new ImageIcon("images/playerL.png");

    }


    private void setInitLayout() {
        x = 55;
        y = 535;
        setSize(50,50);
        setIcon(playerR);
        setLocation(x,y);

    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
