package gui;


import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame  {

    private int x;
    public Fenster() {
        setSize(500, 500);
        addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                beenden();
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
         new Fenster();
    }

    private void beenden() {
        // Daten sichern
        dispose();
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(final KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                beenden();
            }
        }
    }

    /*private class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(final WindowEvent e) {
            beenden();
        }
    }
    */

}