package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChagneFrame3 extends JFrame implements ActionListener {
    private JButton[] button;
    private JPanel panel;
    private JPanel panel2;
    Color[] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,Color.CYAN,Color.PINK};

    public ColorChagneFrame3() {
        initData();
        setInitLayout();
        addEventListener();
    }

    public void initData(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel2 = new JPanel();

        button = new JButton[7];
        for(int i = 0 ; i < button.length ; i++){
            button[i] = new JButton("button"+i);
        }

    }

    private void setInitLayout(){
        setLayout(new GridLayout(2,1));

        for(int i = 0 ; i < button.length ; i++){
            panel.add(button[i]);
        }
        add(panel);
        add(panel2);


        setVisible(true);
    }

    private void addEventListener(){
        for(int i = 0 ; i < button.length ; i++){
            button[i].addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {

        for(int i = 0 ; i < button.length ; i++){
            if(e.getSource() == button[i]){
                panel2.setBackground(color[i]);
            }
        }

    }

    public static void main(String[] args) {
        new ColorChagneFrame3();
    }
}
