package gui;


import java.awt.*;
import static gui.PaintClone.Form.*;
import static java.awt.Color.*;

public class MyMenuBar extends MenuBar {

    public MyMenuBar(PaintClone paintClone) {
        Menu menu;
        MenuItem menuItem;

        menu = new Menu("Datei");
        menuItem = new MenuItem("beenden");
        menuItem.addActionListener(e->paintClone.beenden());
        menu.add(menuItem);
        add(menu);

        menu = new Menu("Formen");
        menuItem = new MenuItem("Linie");
        menuItem.addActionListener(e->paintClone.setForm(LINIE));
        menu.add(menuItem);

        menuItem = new MenuItem("Rechteck");
        menuItem.addActionListener(e->paintClone.setForm(RECHTECK));
        menu.add(menuItem);

        menuItem = new MenuItem("Oval");
        menuItem.addActionListener(e->paintClone.setForm(OVAL));
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new MenuItem("Löschen");
        menuItem.addActionListener(e->paintClone.setForm(LOESCHEN));
        menu.add(menuItem);

        add(menu);


        menu = new Menu("Farben");
        menuItem = new MenuItem("Weiss");
        menuItem.addActionListener(e->paintClone.setColor(WHITE));
        menu.add(menuItem);

        menuItem = new MenuItem("Rot");
        menuItem.addActionListener(e->paintClone.setColor(RED));
        menu.add(menuItem);

        menuItem = new MenuItem("Blau");
        menuItem.addActionListener(e->paintClone.setColor(BLUE));
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new MenuItem("Grün");
        menuItem.addActionListener(e->paintClone.setColor(GREEN));
        menu.add(menuItem);

        menuItem = new MenuItem("Gelb");
        menuItem.addActionListener(e->paintClone.setColor(YELLOW));
        menu.add(menuItem);

        menuItem = new MenuItem("Pink");
        menuItem.addActionListener(e->paintClone.setColor(PINK));
        menu.add(menuItem);

        add(menu);


    }
}
