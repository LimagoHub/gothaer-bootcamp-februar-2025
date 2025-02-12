package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import static java.lang.Math.*;
public class Fenster extends Frame implements KeyListener, MouseMotionListener {

    private static final int SIZE = 500;
    private String message = "Hallo";
    private int x, y;

    public Fenster() throws HeadlessException {
        setSize(SIZE, SIZE);
        x = y = SIZE / 2;
        addKeyListener(this);
        addMouseMotionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
       new Fenster();
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message, 50, 100);
        g.drawRect(x,y, 30,30);
    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {
        message= "Eine Taste wurde gedrückt!";1

        int a = abs(-20);

        switch (e.getKeyCode()) {
            case VK_UP->y-=5;
            case VK_DOWN->y+=5;
            case VK_LEFT->x-=5;
            case VK_RIGHT->x+=5;
            case VK_ESCAPE->dispose();

        }
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }

    @Override
    public void mouseDragged(final MouseEvent e) {

    }

    @Override
    public void mouseMoved(final MouseEvent e) {
        x+=(e.getX()-x) / 50;
        y+=(e.getY()-y) / 50;
        repaint();
    }
}