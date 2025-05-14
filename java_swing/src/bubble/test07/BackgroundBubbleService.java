package bubble.test07;

/*
* BackgroundPlayerService 는 스레드가 계속 돌고 있는 상태이다
* BackgroundBubbleService 는 스레드가 너무 많이 발생이 되어서
* 게임에 많은 영향을 미칠 수 있다. 즉, 너무 느려질 가능성이 많다
* */


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BackgroundBubbleService {
    private BufferedImage image;
    private Bubble bubble;

    public BackgroundBubbleService(Bubble bubble) {
        try {
            this.bubble = bubble;
            image = ImageIO.read(new File("images/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean upWall(){
        Color upWall = new Color(image.getRGB(bubble.getX() + 35, bubble.getY()));
        if(upWall.getRed() == 255 && upWall.getBlue() == 0 && upWall.getGreen() == 0){
            return true;
        }
        return false;
    }

    // 왼쪽 벽 확인
    public boolean leftWall(){
        Color leftColor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY() + 25));
        if(leftColor.getRed() == 255 && leftColor.getBlue() == 0 && leftColor.getGreen() == 0){

            return true;
        }
        return false;
    }

    public boolean rightWall(){
        Color rightColor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY() + 25));
        if(rightColor.getRed() == 255 && rightColor.getBlue() == 0 && rightColor.getGreen() == 0){

            return true;
        }
        return false;
    }


}
