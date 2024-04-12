import java.util.Scanner;

//This is a calculator I created using Scanner library


public class Calculadora {
    public static void main (String [] args){
        Scanner grava = new Scanner(System.in);
        double n1, n2, resultado;
        int op;

        System.out.println("Bem vindo a calculadora ágil!\n Digite o primeiro valor: ");
        n1 = grava.nextDouble();

        System.out.println("Digite o segundo valor: ");
        n2 = grava.nextDouble();

        System.out.println("Selecione o número da operação que deseja fazer: \n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
        op = grava.nextInt();

        if (op == 1){
            resultado = n1 + n2;
            System.out.println("O resultado é "+ resultado);
        }else if(op == 2){
            resultado = n1 - n2;
            System.out.println("O resultado é "+ resultado);
        }else if(op == 3){
            resultado = n1 * n2;
            System.out.println("O resultado é "+ resultado);
        } else if(op == 4){
            resultado = n1 / n2;
            System.out.println("O resultado é "+ resultado);
        } else {
            System.out.println("O número digitado não é valido!");
        }


    }
}
