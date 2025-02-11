package main;

import collections.Stapel;
import collections.StapelException;
import geo.Kreis;
import geo.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) {

        try {
            Stapel<Punkt> myStapel = new Stapel<>(4);
            for (int i = 0; i < 10; i++) {
                //if(! myStapel.isFull()) {
                    //myStapel.push(new Schwein("Schwein nr." + i)) ;
                    myStapel.push(new Punkt(i,i)) ;
                    myStapel.push(new Kreis(i)) ;
                    //myStapel.push(i) ;
                //}
            }

            while (! myStapel.isEmpty()) {

                Punkt p = myStapel.pop();
                p.rechts();
                System.out.println(p);
            }
        } catch (StapelException e) {
            e.printStackTrace();
        }
    }
}