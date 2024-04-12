//A calculator using JoptionPane

import javax.swing.*;
import java.util.Scanner;
public class Jo {
    public static void main (String[] args){
        String x = JOptionPane.showInputDialog(null,"Digite um valor", "Cadastro de cliente",3);
        int valor = Integer.parseInt(x);
        String z = JOptionPane.showInputDialog(null,"escolha a operação:\n1-adição\n2-Subtração\n3-Multiplicação\n4-Divisão", "Cadastro de cliente",3);
        int valor3 = Integer.parseInt(z);
        String y = JOptionPane.showInputDialog(null,"Digite um segundo valor", "Cadastro de cliente",3);
        int valor2 = Integer.parseInt(y);
        double resultado;

        if (valor3 ==1){
            resultado = valor + valor2;
            JOptionPane.showMessageDialog(null,"o resultado é " + resultado);
        }else if(valor3 ==2){
            resultado = valor - valor2;
            JOptionPane.showMessageDialog(null,"o resultado é " + resultado);
        }else if(valor3 == 3){
            resultado = valor * valor2;
            JOptionPane.showMessageDialog(null,"o resultado é " + resultado);
        } else if(valor3 == 4){
            resultado = valor / valor2;
            JOptionPane.showMessageDialog(null,"o resultado é " + resultado);
        }else {
            JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor digite uma opção válida");
        }
    }
}