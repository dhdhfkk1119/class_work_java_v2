package lotto.ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LottoFrame extends JFrame implements ActionListener {
    private JButton jButton;
    LottoRandomNumber number = new LottoRandomNumber();


    public LottoFrame(){
        initData();
        setInitLayout();
        addEventListener();
    }


    private void initData(){
        setTitle("로또 판매기");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jButton = new JButton("로또 번호 생성");
    }

    private void setInitLayout(){

        add(jButton,BorderLayout.NORTH);
        setVisible(true);

    }

    private void addEventListener(){
        jButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 그림을 다시 그려라
        Arrays.toString(number.randNumber());
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("궁서체",Font.BOLD,20);
        setFont(f);

        g.drawString(Arrays.toString(number.randNumber()) + "" , 100 , 300);

    }

    public static void main(String[] args) {
        new LottoFrame();
    }
}
