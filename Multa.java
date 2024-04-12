//Using conditionals to tell the user if they will recieve a traffic ticket

import java.util.Scanner;

public class Multa {
    public static void main (String [] args){
        Scanner grava = new Scanner(System.in);
        int via,vel,resultado;
        System.out.println("Bem vindo ao programa multas-on\n qual é o limite da via?");
        via = grava.nextInt();

        System.out.println("Qual era a velocidade do carro?");
        vel = grava.nextInt();

        resultado = vel - via;

        if(resultado <= 9){
            System.out.println("Você estava na velocidade permitida, e não receberá multas :)");
        }else if(resultado == 10 ){
            System.out.println("Multa de R$80,00");
        }else if(resultado > 10 && resultado <= 39 ){
            System.out.println("Multa de R$120,00");
        }else {
            System.out.println("Multa de R$200,00");
        }


    }
}
