//Creating a system to control the entrance of clients above the age of 18

import java.util.Scanner;

public class Idade {
    public static void main (String [] args){
        Scanner grava = new Scanner (System.in);
        int idade;

        System.out.println("Qual a sua idade?");
        idade = grava.nextInt();

        if (idade >= 18){
            System.out.println("Tudo certo! Pode passar");
        } else {
            System.out.println("Você não está autorizado a entrar!");
        }
    }
}
