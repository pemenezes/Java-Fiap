//Concating the names given by the user

import java.util.Scanner;

public class Letras {
    public static void main (String [] args){
        Scanner grava = new Scanner(System.in);
        String nome1, nome2, nome3, nomeCompleto;

        System.out.println("Digite seu primeiro nome");
        nome1 = grava.nextLine();

        System.out.println("Digite seu nome do meio");
        nome2 = grava.nextLine();

        System.out.println("Digite seu último nome");
        nome3 = grava.nextLine();

        nomeCompleto = nome1 + " " + nome2 + " " + nome3;

        System.out.println("Obrigado, " + nomeCompleto + "\nAgora iremos fazer seu cadastro!");

    }
}
