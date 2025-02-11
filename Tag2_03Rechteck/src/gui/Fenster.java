package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenster extends Frame implements KeyListener {

    private static final int SIZE = 500;
    private String message = "Hallo";
    private int x, y;

    public Fenster() throws HeadlessException {
        setSize(SIZE, SIZE);
        x = y = SIZE / 2;
        addKeyListener(this);
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
        message= "Eine Taste wurde gedrückt!";
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
            dispose();
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}