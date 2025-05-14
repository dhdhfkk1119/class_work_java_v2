package bubble.test03;

/*
 * 현재 메인 쓰레드는 너무 바쁜 상태이다*/

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;

    // 생성자 의존 주입 (DI) 생성자 안에 Player player 다른 객체를 주입해준다
    public BackgroundPlayerService(Player player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("images/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // start() 메서드가 호출 되면 동작 하도록 약속 되어 있다
    @Override
    public void run() {
        while (true) {

            Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
            // Player 좌표에 보정 값 추가
            Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));
            // 플레이어의 좌표 값에 따라서 빨간색 파란색 하얀색을 구분 할 수 있다
//            System.out.println("왼쪽 확인 : " + leftColor);
//            System.out.println("왼쪽 확인 : " + rightColor);

            // leftColor - 논리적으로 255 ,0 ,0 이면 왼쪽벽에 충동함으로 판단
            // rightColor - 논리적으로 255 ,0 ,0 이면 왼쪽벽에 충동함으로 판단
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 || leftColor.getBlue() == 0) {
                player.setLeftWallCrash(true);
                player.setLeft(false);
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 || rightColor.getBlue() == 0) {
                player.setRightWallCrash(true);
                player.setRight(false);
            } else {
                player.setRightWallCrash(false);
                player.setLeftWallCrash(false);
            }


            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
