package com.codecool.termlib;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class Input {
    private static final HashSet<Character> validFirstCoordinateInputs = new HashSet<>(){{add('a'); add('b'); add('c'); add('d');}};
    private static final HashSet<Character> validSecondCoordinateInputs = new HashSet<>(){{add('1'); add('2'); add('3'); add('4');}};
    private static final HashMap<Character, Integer> gridCoordinates = new HashMap<>(){{put('a', 1); put('b', 2); put('c', 3); put('d', 4);}};
    public int[] getFieldICoordinate() {

        int[] results;
        Character iRaw = 0;
        Character jRaw = 0;
        int iCoordinate;
        int jCoordinate;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter coordinate: ");
        String coordinates = in.next();

        try {
            iRaw = Character.toLowerCase(coordinates.charAt(0));
            jRaw = coordinates.charAt(1);

        }
        catch (Exception e) {
        }
        if (validFirstCoordinateInputs.contains(iRaw) && validSecondCoordinateInputs.contains(jRaw)) {
            iCoordinate = gridCoordinates.get(iRaw);
            jCoordinate = Integer.parseInt(jRaw.toString());
            results = new int[]{iCoordinate+1, jCoordinate+1};

        }
        else {
            results = new int[]{0,0};
        }
        // in.close();

        return results;
    }
}