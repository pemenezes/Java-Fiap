//Creating a quizz

import java.util.Scanner;

public class quiz {
    public static void main(String[]args){
        Scanner grava = new Scanner(System.in);
        int alfa,pontos = 0,jojo,corinthians;
        String japa;
        System.out.println("Bem vindo ao meu Quiz\nA primeira pergunta é:\nquantas letras tem no alfabeto?");
        alfa = grava.nextInt();
        if (alfa == 26){
            pontos = + 1;
            System.out.println("Certa resposta!");
        } else{
            System.out.println("Resposta errada!");
        }
        System.out.println("Segunda pergunta\nQual é o nome dado aos guerreiros japoneses que usavam espadas?");
        japa = grava.nextLine();

        if (japa == "samurai") {
            pontos = + 1;
            System.out.println("Certa resposta!");
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println("Terceira pergunta\nNo anime JoJo's Bizarre Adventure, qual é a temporada que Josuke é introduzido?");
        jojo = grava.nextInt();
        if (jojo == 4){
            pontos = + 1;
            System.out.println("Certa resposta!");
        }else {
            System.out.println("Resposta errada!");
        }
        System.out.println("Quarta  pergunta\nQual foi o ano que o Corinthians foi campeão mundial?");
        corinthians = grava.nextInt();

        if (corinthians == 2012){
            pontos = + 1;
            System.out.println("Certa resposta!");
        }else {
            System.out.println("Resposta errada!");
        }

        System.out.println("Você acertou " + pontos +"questões do total de 4");

    }
}
