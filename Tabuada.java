//showing the multiplication table of the number given by the user

import java.util.Scanner;

public class Tabuada {
    public static void main (String [] args){
        Scanner grava = new Scanner(System.in);
        int tab;
        int cont =0;

        System.out.println("Qual numero você deseja ver a tabuada?");
        tab = grava.nextInt();

        while (cont <10){
            cont++;
            System.out.println((tab*cont));
        }
    }
}
