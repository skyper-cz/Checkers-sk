package com.company;

import java.util.Scanner;

import static com.company.Main.*;
import static com.company.Render.Vykresleni;

public class Gameplay {
    public static void Hra() {
        while (Hra) {
            boolean jeden = true;
            boolean kontrola = true;

            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            Scanner sc4 = new Scanner(System.in);

            Vykresleni();
            System.out.println("Hráči jedna, zvolte kámen");

            while (kontrola)
            while (jeden) {
                System.out.println("Zadejte souřadnici Y");
                souradniceX = sc1.nextInt();
                if (souradniceX > 8) {
                    System.out.println("Číslo mimo pole");
                    System.out.println("Zadejte nové číslo");
                } else {
                    jeden = false;
                }
            }
            jeden = true;
            while (jeden) {
                System.out.println("Zadejte souřadnici X");
                souradniceY = sc2.nextInt();
                if (souradniceY > 8) {
                    System.out.println("Číslo mimo pole");
                    System.out.println("Zadejte nové číslo");
                } else {
                    jeden = false;
                }
            }
            jeden = true;
            if (Pole[souradniceX - 1][souradniceY - 1] == 1) {
                System.out.println("Chcete jít vpravo nebo vlevo? (L R)");
                String pismeno = sc3.next();

                    if (pismeno == "R"){
                        if (souradniceX > 8 || souradniceY > 8) {
                            System.out.println("nelze provést tento pohyb");
                        }
                    }
                    else if ((pismeno == "R"){
                    if (souradniceX > 8 || souradniceY > 8) {
                        System.out.println("nelze provést tento pohyb");
                    })
            }
            else if (Pole[souradniceX - 1][souradniceY - 1] == 2) {

            }

            }



        }
        System.out.println("Gratuluji");
        System.out.println("Vyhrál hráč" );

    }
}
