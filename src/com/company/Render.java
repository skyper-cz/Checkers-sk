package com.company;

import static com.company.Main.Pole;

public class Render {
    public static void Vykresleni() {
        System.out.println();
        System.out.println("      1 2 3 4 5 6 7 8");

        for (int radek = 0; radek < Pole.length; radek++) {

                System.out.print("  " + (radek + 1) + " | ");


            for (int sloupec = 0; sloupec < Pole[radek].length; sloupec++) {
                    if (Pole[radek][sloupec] == 0){
                        System.out.print("  ");
                    }
                    else if (Pole[radek][sloupec] == 1){
                        System.out.print("@ ");
                    }
                    else if (Pole[radek][sloupec] == 2){
                        System.out.print("$ ");
                    }
                    else if (Pole[radek][sloupec] == 3){
                        System.out.print("* ");
                    }
                    else if (Pole[radek][sloupec] == 4){
                        System.out.print("& ");
                    }

                }

            System.out.println("| " + (radek + 1));
        }
        System.out.println("      1 2 3 4 5 6 7 8");
        System.out.println();
    }
}
