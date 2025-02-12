package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintClone extends Frame {

    private static final int SIZE =1000;

    public PaintClone() throws HeadlessException {
        setSize(SIZE,SIZE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {dispose();}
        });
        setMenuBar(new MyMenuBar());
    }

    public static void main(String[] args) {
          new PaintClone().setVisible(true);
    }
}