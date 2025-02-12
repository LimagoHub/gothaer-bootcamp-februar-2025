package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintClone extends Frame {


    public enum Form {LINIE, RECHTECK,OVAL,LOESCHEN}
    private static final int SIZE =1000;

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

    public PaintClone() throws HeadlessException {
        setSize(SIZE,SIZE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {beenden();}
        });
        setMenuBar(new MyMenuBar(this));
    }

    /* Default */ void beenden() {
        dispose();
    }

    public static void main(String[] args) {
          new PaintClone().setVisible(true);
    }
}