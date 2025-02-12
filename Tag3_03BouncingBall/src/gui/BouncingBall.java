package gui;


import java.awt.*;

public class BouncingBall extends Frame {

    private static final int SIZE = 1000;
    private boolean gameover = false;
    private int x, y;
    private int xRichtung = -2;
    private int yRichtung = -1;


    public BouncingBall()  {
        super("Bouncing Ball");
        x = y = SIZE / 2;
        setSize(SIZE, SIZE);
        setVisible(true);
        createBufferStrategy(2);
    }

    public static void main(String[] args) {
        new BouncingBall().gameLoop();
    }

    private void gameLoop() {
        while (!gameover) {
            calculateScene();
            renderScene();
        }
    }
    private void calculateScene() {
        x += xRichtung;
        y += yRichtung;

        if(x < 0 || x > getWidth()) xRichtung *= -1;
        if(y < 0 || y > getHeight()) yRichtung *= -1;
    }
    private void renderScene() {
        Graphics g = null;
        try {
            g = getBufferStrategy().getDrawGraphics();
            g.clearRect(0,0,getWidth(),getHeight());
            g.setColor(Color.RED);
            g.fillOval(x+15, y+15, 30, 30);
        } finally {
            if(g != null) g.dispose();
        }
        getBufferStrategy().show();
    }


}