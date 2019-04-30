package com.codecool.termlib;

import java.util.Scanner;

public class Main {

    static Scanner column = new Scanner(System.in);
    static Scanner row = new Scanner(System.in);

    public static void main(String[] args) {
        Grid.mainGrid();
        printTable();
        }

    static void printTable() {
        for (String[] row : Grid.table) {
            for (String elem : row) {
                System.out.print(elem);
            }
            System.out.println();
        }
    }
}





