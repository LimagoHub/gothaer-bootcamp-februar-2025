package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Linie extends Frame  {

    private static final int SIZE = 500;

    private BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);

    public Linie() {
        setBackground(Color.BLACK);
        setSize(SIZE, SIZE);   addMouseListener(new MyMouseListener());  setResizable(false); setVisible(true);
    }

    public static void main(String[] args) {

        new Linie();
    }
    @Override
    public void paint(final Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

    private void zeichneLine(int x1, int y1, int x2, int y2) {
        Graphics g = image.getGraphics();
        g.drawLine(x1,y1,x2,y2);
        g.dispose();
        repaint();
    }

    private class MyMouseListener extends MouseAdapter {
        private int x,y;

        @Override
        public void mousePressed(final MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }

        @Override
        public void mouseReleased(final MouseEvent e) {
           zeichneLine(x,y,e.getX(),e.getY());
        }
    }
}