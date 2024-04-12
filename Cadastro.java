import java.util.Scanner;

//A menu where the client can include his documents, alter them,
// exclude them or get out of the system. I used the Scanner library

public class Cadastro {
    public static void main (String [] args){
        Scanner grava = new Scanner(System.in);
        int menu;

        System.out.println("MENU\n1 - Inclusão \n2 - Alteração\n3 - Excluir\n4 - Sair");
        menu = grava.nextInt();
        if(menu == 1){
            int cpf, rg;
            System.out.println("Digite seu CPF");
            cpf = grava.nextInt()git add .
            ;

            System.out.println("Digite seu RG");
            rg = grava.nextInt();

            System.out.println("Novo usuário registrado com sucess!\n Seu CPF registrado é " + cpf + " e seu RG registrado é " + rg);

        } else if(menu ==2){
            System.out.println("Registro alterado com sucesso!");
        }else if(menu == 3){
            System.out.println("Registro excluído com sucesso");
        } else if(menu == 4){
            System.out.println("Encerrando o sistema");
        } else {
            System.out.println("Você digitou uma opção inválida. Por favor digite um dos números no menu");
        }

    }
}
