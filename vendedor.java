//Using JoptionPane, its a system to controll the sales of every salesman in a store

import javax.swing.*;
public class vendedor {
    public static void main(String[] args) {
        int[] vendas = new int[10];
        double[] preco = new double[10];
        double[] totalVendas = new double[10];
        int total = 0;
        for (int cont = 0; cont <= 9; cont++) {
            String x = JOptionPane.showInputDialog(null, "Insira a quantidade de peças vendidas pelo vendedor " + (cont + 1));
            String y = JOptionPane.showInputDialog(null, "Insira o valor da peça vendida pelo vendedor " + (cont + 1));
            vendas[cont] = Integer.parseInt(x);
            preco[cont] = Double.parseDouble(y);
            total += vendas[cont];
            totalVendas[cont] = (vendas[cont] * preco[cont]);
        }
        JOptionPane.showMessageDialog(null, "O total de peças vendidas por todos os vendedores juntos foi de " + total);
        for (int cont = 0; cont <= 9; cont++) {
            JOptionPane.showMessageDialog(null, "O total vendido pelo vendedor " + (cont + 1) + " foi de " + totalVendas[cont]);
        }
    }
}