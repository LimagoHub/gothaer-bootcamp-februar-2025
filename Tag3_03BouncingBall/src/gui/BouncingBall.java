package gui;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;

public class BouncingBall extends Frame {

    private static final int SIZE = 1000;
    private boolean gameover = false;
    private Ball ball = new Ball();
    private int xRichtung = -2;
    private int yRichtung = -1;


    public BouncingBall()  {
        super("Bouncing Ball");
        ball.setPosition(new Point(SIZE/2, SIZE/2));
        setSize(SIZE, SIZE);
        addKeyListener(new MyKeyListener());
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
        Point p = ball.getPosition();
        p.x += xRichtung;
        p.y += yRichtung;
        ball.setPosition(p);

        if(p.x < 0 || p.x > getWidth()) xRichtung *= -1;
        if(p.y < 0 ) yRichtung *= -1;
        if(p.y >= getHeight()) {
            gameover = true;
        }
    }
    private void renderScene() {
        Graphics g = null;
        try {
            g = getBufferStrategy().getDrawGraphics();
            g.clearRect(0,0,getWidth(),getHeight());
            if(gameover) {
                g.drawString("Game Over", getWidth()/2, getHeight()/2);
            }
            g.setColor(Color.RED);
            ball.paint(g);
        } finally {
            if(g != null) g.dispose();
        }
        getBufferStrategy().show();
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(final KeyEvent e) {
            switch (e.getKeyCode()) {
                case VK_UP->yRichtung-=2;
                case VK_DOWN->yRichtung+=2;
                case VK_LEFT->xRichtung-=2;
                case VK_RIGHT->xRichtung+=2;
                case VK_SPACE->xRichtung = yRichtung = 0;
            }
        }
    }
}