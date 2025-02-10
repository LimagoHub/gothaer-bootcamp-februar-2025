package main;

import collections.Stapel;
import geo.Kreis;
import geo.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) {

        Stapel myStapel = new Stapel(40);
        for (int i = 0; i < 10; i++) {
            if(! myStapel.isFull()) {
                myStapel.push(new Schwein("Schwein nr." + i)) ;
                myStapel.push(new Punkt(i,i)) ;
                myStapel.push(new Kreis(i)) ;
            }
        }

        while (! myStapel.isEmpty()) {
            System.out.println(myStapel.pop());
        }
    }
}