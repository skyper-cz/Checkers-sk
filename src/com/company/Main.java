package com.company;

import static com.company.Gameplay.Hra;
import static com.company.Priprava.Prepare;

public class Main {

    public static int[][] Pole = new int[8][8];
    public static int souradniceX;
    public static int souradniceY;
    public static int bily = 12;
    public static int cerny = 12;
    public static boolean Hra = true;

    public static void main(String[] args) {
        for (int x = 0; x < 8; x++){
            for (int y = 0; y < 8; y++){
                Pole[x][y] = 0;
            }
        }
        System.out.println("Vítej hráči");
        System.out.println("Je čas na dámu");
        Prepare();
        System.out.println("Pole nachystáno");
        System.out.println("POZOR PRVNÍ SE ZADÁVÁ OSA Y A AŽ PAK OSA X");
        System.out.println("Hodně štěstí hráči");
        Hra();
    }
}
