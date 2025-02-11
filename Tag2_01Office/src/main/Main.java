package main;

import office.Dokument;
import office.Excel;
import office.Word;

public class Main {
    public static void main(String[] args) {

        Dokument dok = new Excel();
        dok.drucken();
    }
}