//Calculating

import java.util.Scanner;

public class Real {
    public static void main (String [] args){
        Scanner grava = new Scanner(System.in);
        String nome;
        double valor, resultado;

        System.out.println("Digite seu nome");
        nome = grava.nextLine();

        System.out.println(nome + ",defina um valor");
        valor = grava.nextDouble();

        resultado = valor - 4 * 2 * 100 - 56 + 54 * 18 * 70 + 22;

        System.out.println(nome +", o resultado da conta é " + resultado);



    }
}
