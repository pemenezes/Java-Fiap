//Calculating the grade average of a studant

import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        double nota1,nota2,nota3,media,provas;
        String nome;

        Scanner grava = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = grava.nextLine();

        System.out.println(nome + " digite sua nota na primeira prova");
        nota1 = grava.nextDouble();
        System.out.println(nome + " digite sua nota na segunda prova");
        nota2 = grava.nextDouble();
        System.out.println(nome + " digite sua nota na terceira prova");
        nota3 = grava.nextDouble();
        System.out.println("Quantas provas você fez?");
        provas = grava.nextDouble();

        media = (nota1 + nota2 + nota3) / provas;

        System.out.println(nome = " Sua média foi de " + media);


    }
}