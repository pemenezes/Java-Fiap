import java.util.Scanner;
//This code is meant to create a MENU where the client can register a new user,
// to alter its user, to delete its user and to get out of the system :)

public class cad {
    public static void main (String[] args){
        int op;
        Scanner grava = new Scanner(System.in);

        System.out.println("CADASTRO DE CLIENTE");
        System.out.println("1-Cadastrar");
        System.out.println("2-Alterar");
        System.out.println("3-Excluir");
        System.out.println("4-Sair");
        op = grava.nextInt();

        switch (op){
            case 1:
                System.out.println("Você acessou o cadastro");
                break;

            case 2:
                System.out.println("Você acessou aba de alteração");

                break;

            case 3:
                System.out.println("Sua conta sera excluida");

                break;

            case 4:
                System.out.println("Saindo do sistema");

                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}