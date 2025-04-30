package _swing2;

import _swing.BoardLayoutEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel;


    public ColorChangeFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("Change Color1");
        button2 = new JButton("Change Color2");
    }

    private void setInitLayout(){
        setLayout(new BorderLayout());

        panel.setBackground(Color.YELLOW);
        add(panel, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setVisible(true);
    }


    // 이벤트를 발생시키기 위한 장소
    private void addEventListener(){
        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    
    // addEventListener 이 실행이되면 action Performed 를 실행시켜준다
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        System.out.println(button.getText());

        if(e.getSource() == button1){
            panel.setBackground(Color.BLUE);
        }else {
            panel.setBackground(Color.YELLOW);
        }

    }

    public static void main(String[] args) {
        ColorChangeFrame2 frame = new ColorChangeFrame2();
    }
}
