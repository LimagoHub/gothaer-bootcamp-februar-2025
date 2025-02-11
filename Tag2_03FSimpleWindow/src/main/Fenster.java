package main;

import javax.swing.*;
import java.awt.*;

public class Fenster extends Frame {


    private int counter = 0;
    public Fenster() {
        super("Ein tolles Fenster");
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Hallo Fenster: Nr" + counter ++, 50, 100);


    }

    public static void main(String[] args) {
       new Fenster();
    }
}