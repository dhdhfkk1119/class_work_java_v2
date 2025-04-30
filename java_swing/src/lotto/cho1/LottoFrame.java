package lotto.cho1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LottoFrame extends JFrame implements ActionListener {
    private JButton jButton;
    private JPanel jPanel;
    private JPanel jPanel2;

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
        jPanel = new JPanel();
        jPanel2 = new JPanel();
        
    }

    private void setInitLayout(){
        add(jButton,BorderLayout.NORTH);

        add(jPanel);
        add(jPanel2);
        setVisible(true);
    }

    private void addEventListener(){
        jButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        new LottoFrame();
    }
}
