package lotto.ch03;

import lotto.ch02.LottoRandomNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LottoFrame extends JFrame implements ActionListener {

    private static final String INITIAL_MESSAGE = "로또 번호를 클릭하세요";
    private static final String FONT_NAME = "궁서체";
    private static final int FONT_SIZE = 20;

    private JButton jButton;
    private LottoRandomNumber number;
    private boolean isInitialState = true; // 초기 상태
    private int[] currentNumbers;

    public LottoFrame(){
        initData();
        setInitLayout();
        addEventListener();
    }


    private void initData(){
        setTitle("로또 판매기");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        number = new LottoRandomNumber();
        currentNumbers = new int[6];
        jButton = new JButton(INITIAL_MESSAGE);
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
        isInitialState = false;
        // 그림을 다시 그려라
        currentNumbers = number.randNumber();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font(FONT_NAME,Font.BOLD,FONT_SIZE));
        if(isInitialState){
            g.drawString(INITIAL_MESSAGE,230,200);
        } else {
            for(int i=0;i<currentNumbers.length;i++){
                g.drawString((currentNumbers[i]) + "" , 100 + (i * 50) , 300);
            }
        }

    }

    public static void main(String[] args) {
        new LottoFrame();
    }
}
