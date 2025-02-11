package main;
public class Main {
    public static void main(String[] args) {

        try {
            int a, b, c;

            a = b = 0;

            c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Vielen Dank, Sie haben ein kleines Programm echt gluecklich gemacht!");
    }


}