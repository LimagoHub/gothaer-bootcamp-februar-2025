package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenster extends Frame implements KeyListener {

    private String message = "Hallo Fenster";

    private int counter = 0;
    public Fenster() {
        super("Ein tolles Fenster");
        setSize(500, 500);
        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.setColor(Color.RED);
        g.drawString(message + ": Nr" + counter ++, 50, 100);


    }

    public static void main(String[] args) {
       new Fenster();
    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {
        message = "Taste wurde gedrückt";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}