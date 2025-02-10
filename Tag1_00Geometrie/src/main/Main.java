package main;

import geo.Kreis;
import geo.Punkt;

public class Main {
    public static void main(String[] args) {

        Kreis p = new Kreis();
        for(int i = 0; i < 11; i++) {
            p.rechts();
            System.out.println(p);
        }
    }
}