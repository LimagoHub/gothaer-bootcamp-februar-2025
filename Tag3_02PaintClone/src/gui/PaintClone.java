package gui;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class PaintClone extends Frame {


    public enum Form {LINIE, RECHTECK,OVAL,LOESCHEN}
    private static final int SIZE =1000;
    private final BufferedImage image = new BufferedImage(SIZE,SIZE,BufferedImage.TYPE_INT_RGB);
    private Form form = Form.LINIE;
    private Color color = Color.WHITE;

    public Form getForm() {
        return form;
    }

    public void setForm(final Form form) {
        this.form = form;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    public PaintClone()  {
        setSize(SIZE,SIZE);
        setResizable(false);
        setBackground(Color.BLACK);
        addMouseListener(new MyMouseListener());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {beenden();}
        });
        setMenuBar(new MyMenuBar(this));
    }

    /* Default */ void beenden() {
        dispose();
    }

    @Override
    public void paint(final Graphics g) {
        g.drawImage(image,0,0,this);
    }

    public static void main(String[] args) {
          new PaintClone().setVisible(true);
    }

    private void zeichnen(int startX, int startY, int endX, int endY) {
        Graphics g = image.getGraphics();
        g.setColor(getColor());
        switch (getForm()) {
            case LINIE -> g.drawLine(startX, startY, endX, endY);
            case RECHTECK -> drawNormalizedRectangle(g,startX, startY, endX, endY);
            case OVAL -> g.drawOval(startX, startY, endX-startX, endY-startY);
            case LOESCHEN -> g.clearRect(startX, startY, endX-startX, endY-startY);
        }
        g.dispose();
        repaint();
    }

    private void drawNormalizedRectangle(Graphics g, int startX, int startY, int endX, int endY) {
        Rectangle r = normalizeCoords(startX, startY, endX, endY);
        g.drawRect(r.x,r.y,r.width,r.height);
    }

    private Rectangle normalizeCoords(int startX, int startY, int endX, int endY) {
        int x1 = startX < endX ? startX : endX;
        int y1 = startY < endY ? startY : endY;
        int x2 = startX > endX ? startX : endX;
        int y2 = startY > endY ? startY : endY;

        return new Rectangle(x1,y1,x2-x1,y2-y1);
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

            zeichnen(x, y, e.getX(), e.getY());
        }
    }
}