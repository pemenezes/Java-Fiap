//This code is meant to controll the sales of a salesman

import javax.swing.*;
public class codProduto {
    public static void main (String [] args){
        int [] codigo = new int[5];
        double [] preco = new double[5];
        double media = 0;
        double mediaReal = 0;
        int maisCem = 0;
        int qtdInferior = 0;
        String z = "";
        for(int cont = 0; cont <=4; cont++){
            String x = JOptionPane.showInputDialog(null,"Informe o código do produto "+(cont+1));
            String y =JOptionPane.showInputDialog(null,"Informe o preço do produto "+(cont+1));
            codigo[cont] = Integer.parseInt(x);
            preco[cont] = Double.parseDouble(y);
            if (preco[cont] < 50){
                qtdInferior++;
            }
            if (preco[cont] >=50 && preco[cont] <=100){
                z +="|" + x;
            }
            if (preco[cont] >= 100){
                media += preco[cont];
                maisCem++;
                mediaReal = media / maisCem;
            }
        }
        JOptionPane.showMessageDialog(null,"A quantidade de produtos com valor inferior a R$50,00 é de "+qtdInferior);
        JOptionPane.showMessageDialog(null,"Os códigos dos produtos com valor entre 50 e 100 reais são "+z);
        JOptionPane.showMessageDialog(null,"A média dos preços dos produtos com preço superior a 100 reais é de "+mediaReal);
    }
}