//Sum values

import javax.swing.*;

public class joption {
    public static void main (String [] args){
        String nome;
        double x,y;
        //JOptionPane.showMessageDialog(null,"bom dia, e feliz dia das mulheres","mensagem",-1);
        nome =JOptionPane.showInputDialog(null,"insira um valor");
        x = Double.parseDouble(nome);

        String nome2 = JOptionPane.showInputDialog(null,"insira o segundo valor");
        y = Double.parseDouble(nome2);

        double val = y + x;

        JOptionPane.showMessageDialog(null,"o resultado da soma dos dois valores é "+ val);



    }
}
