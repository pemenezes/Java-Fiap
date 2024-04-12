//Using vectors and JoptionPane, its a code to controll the sales of every salesman in a store

import javax.swing.*;
public class vendedorescod {
    public static void main(String[] args) {
        int[] totalVendas = new int[5];
        double[] porcent = new double[5];
        int[] codigo = new int[5];
        String codigos = "", valores = "";
        for (int cont = 0; cont <= 4; cont++) {
            String x = JOptionPane.showInputDialog(null, "Insira o total de vendas do vendedor " + (cont + 1));
            String y = JOptionPane.showInputDialog(null, "Insira o percentual de comissão do vendedor " + (cont + 1));
            String z = JOptionPane.showInputDialog(null, "Insira o código do vendedor " + (cont + 1));
            totalVendas[cont] = Integer.parseInt(x);
            porcent[cont] = Double.parseDouble(y);
            codigo[cont] = Integer.parseInt(z);
            codigos += "|" + codigo[cont];
            valores += "|" + totalVendas[cont];
        }
    }
}