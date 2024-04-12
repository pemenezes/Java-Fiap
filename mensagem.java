//Creating a system menu that has different options, using Scanner

import java.util.Scanner;

public class mensagem {
    public static void main(String [] args){
        Scanner grava = new Scanner(System.in);
        int op;
        System.out.println("MENU\n1-Ver mensagem\n2-10% do valor\n3-Saber sua categoria\n4-Sair");
        op = grava.nextInt();

        switch (op){
            case 1:
                System.out.println("Rosas são vermelhas, violetas são azuis, você é tão lindo, quanto Arlindo Cruz");
                break;

            case 2:
                double v1;
                System.out.println("Insira um valor:");
                v1 = grava.nextDouble();
                System.out.println("10% de "+v1+" é "+(v1/10));
                break;

            case 3:
                int idade;
                System.out.println("Qual sua idade?");
                idade = grava.nextInt();

                if (idade <=10){
                    System.out.println("Categoria Infantil");
                }else if(idade >=11 && idade <=13){
                    System.out.println("Categoria infanto-juvenil");
                } else if(idade >=14 && idade <=17){
                    System.out.println("Categoria pré-adolescente");

                }else{
                    System.out.println("Categoria adulto");
                }
                break;

            case 4:
                System.out.println("Saindo do sistema");

                break;

            default:
                System.out.println("Opção inválida!");
                break;

        }
    }
}
